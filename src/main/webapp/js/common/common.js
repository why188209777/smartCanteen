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
	
	
	
	
	//购物车滑过高亮
	$("#cartImg").on("mouseover",function(){
		$(this).attr("src","images/carthover.png");
		
	})
	$("#cartImg").on("mouseout",function(){
		$(this).attr("src","images/cart.png");
	})
})
