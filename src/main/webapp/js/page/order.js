/*
 * 订单
 */

$(function(){
	//初始化
	
	//获取地址栏参数
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	var out_trade_no=GetQueryString(GetQueryString);//订单号
	if(out_trade_no!=null || out_trade_no.length>0){
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
		var out_trade_no=GetQueryString(GetQueryString);//订单号
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
	
	function getOrderDetails(){
		var dom=$("#menu");
		dom.html(" ");
		var str="";
		str=`
			<h1>暂无订单</h1>
		`;
		dom.append(str)
	};
	getOrderDetails();
})
