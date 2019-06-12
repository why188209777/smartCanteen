/*
 * 公共js
 */
$(function(){
	//获取session User
	function getStorage(){
		var user=sessionStorage.getItem("user");
		var upwd=sessionStorage.getItem("upwd");
		if(user!=null){
			$("#loginUser").text(user);
		}/*else{
			$("#loginUser").text("login");
		}*/
	}
	getStorage();
	
	
	//初始化餐厅列表
	function getAllCanteen() {
		$.ajax({
			type: "post",
			url: "http://localhost:8080/smartCanteen/canteen/getAllCanteen.do",
			dataType: "json",
			success: function(data) {
				let dom = $("#canteenList");
				dom.html("");
				let str = ""; //通用字符串模板
				for(let i = 0; i < data.length; i++) {
					str += `
						<option value="${i+1}">${data[i].cname}</option>
					`;
				}
				dom.append(str);
			},
			error: function(error) {
				console.log(error);
			}
		});
	}

	//初始化店铺列表
	function getAllMerchant(cid) {
		$.ajax({
			type: "post",
			url: "http://localhost:8080/smartCanteen/merchant/getMerchantByCid.do",
			data: {
				cid: cid
			},
			dataType: "json",
			success: function(data) {
				let dom = $("#storeList");
				dom.html("");
				let str = ""; //通用字符串模板
				for(let i = 0; i < data.length; i++) {
					str += `
						<option value="${data[i].mid}">${data[i].mname}</option>
					`;
				}
				dom.append(str);
			},
			error: function(error) {
				console.log(error);
			}
		});
	}
	getAllCanteen();
	getAllMerchant(1);
	
	//购物车滑过高亮
	$("#cartImg").on("mouseover",function(){
		$(this).attr("src","images/carthover.png");
		
	})
	$("#cartImg").on("mouseout",function(){
		$(this).attr("src","images/cart.png");
	})
})
