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
})
