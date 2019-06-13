/*
 * 公共js
 */
$(function(){
	//获取session User
	function getStorage(){
		var user=sessionStorage.getItem("user");
		var upwd=sessionStorage.getItem("upwd");
		if(user!=null){
			console.log("user不为空");
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
	
	
	//登出
	$("#loginout").on("click",function(event){
		event.preventDefault();
		sessionStorage.removeItem("userid");
		sessionStorage.removeItem("user");
		sessionStorage.removeItem("upwd");
		sessionStorage.removeItem("cart");
		sessionStorage.removeItem("foodTotal");
		window.location.href="login.html";
	});
})

