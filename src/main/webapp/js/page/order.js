/*
 * 订单
 */

$(function(){
	//初始化
	
	//获取当前时间
	function getNowFormatDate() {
        var date = new Date();
        var seperator1 = "-";
        var year = date.getFullYear();
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
        }
        var currentdate = year + seperator1 + month + seperator1 + strDate;
        return currentdate;
    }

	//获取地址栏参数
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	var out_trade_no=GetQueryString("out_trade_no");//订单号
	var order;//订单对象
	if(out_trade_no!=null || out_trade_no.length>0){
		
		var userid=sessionStorage.getItem("userid");//userid
		var createtime=getNowFormatDate();//订单生成时间
		var remark="暂无备注";//备注
		var status=1;//订单状态
		var total=sessionStorage.getItem("foodTotal");//总价
		var mid=1;
		
		function addOrder() {
			$.ajax({
				type: "post",
				url: "order/addOrder.do",
				data: {
					orderid: out_trade_no,
					createtime: createtime,
					remark:remark,
					status:status,
					total:total,
					userid:userid,
					mid:mid
				},
				dataType: "json",
				success: function(data) {
					if(data==true){
						console.log("添加订单成功！")
					}
				},
				error: function(error) {
					console.log(error);
				}
			});
		}
		addOrder();
	}
	
	function getOrderDetails(data){
		console.log(data);
		var dom=$("#menu");
		var str="";
		if(data==null){
			str=`
				<h1 style="text-align:center">暂无订单</h1>
			`;
			
		}else{
			dom.html(" ");
			for(var i=0;i<data.length;i++){
				var orderStatus;
				if(data.[i].status==1){
					orderStatus="已支付";
				}else if(data.[i].status==2){
					orderStatus="已完成";
				}else{
					orderStatus="已取消"
				}
				str+=`
					<div class="orderContainer">
						<div class="orderLeft">	
							<img src="images/d1.jpg" class="orderImg"/>
						</div>
						<div class="orderRight">
							<p>订单编号：<span class="orderId">${data[i].orderid}</span></p>
							<p>下单时间：<span class="orderTime">${data[i].createtime}</span></p>
							<p>备注：<span class="orderRemake">${data[i].remark}</span></p>
							<p>金额：<span class="orderTotal">￥${data[i].total}</span></p>
							<div>
								<a href="" class="orderA">订单状态:${orderStatus}</a>
								<a href="" class="orderA">查看订单详情</a>
							</div>
							
						</div>
					</div>
				`;
			}
		}
		dom.append(str);
	};
//	getOrderDetails();
	
	
	
	function getOrderList(){
		$.ajax({
				type: "post",
				url: "order/getOrderByUserId.do",
				data: {
					userId: sessionStorage.getItem(userid),
				},
				dataType: "json",
				async:false,
				success: function(data) {
					if(data!=true){
						getOrderDetails(data);
						//下单成功后删除session
						sessionStorage.removeItem("cart");
						sessionStorage.removeItem("foodTotal");
					}
				},
				error: function(error) {
					console.log(error);
				}
			});
	}
	getOrderList();
})
