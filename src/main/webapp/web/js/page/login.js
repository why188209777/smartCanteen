/*
 * 
 * login
 */
$(function(){
	
	
//	初始化
	function getInit(){
		var user=sessionStorage.getItem("user");
		var upwd=sessionStorage.getItem("upwd");
		if(user!=null){
			$("#loginUser").text(user);
			var dom=$(".account_grid");
			dom.html("");
			var str="";
			str+=`
			<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s">
				<div class="register-top-grid">
					<h2>个人信息</h2>
					<div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>用户名<label>*</label></span>
						<input type="text" id="userName">
					</div>
					<div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>班级<label>*</label></span>
						<input type="text" id="userClass">
					</div>
					<div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>学号<label>*</label></span>
						<input type="text" id="UserStuID">
					</div>
					<div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>地址<label>*</label></span>
						<input type="text" id="userAddress">
					</div>
					<div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>手机<label>*</label></span>
						<input type="text" id="phonenum">
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			`;
			dom.append(str);
		}
	}
	getInit();
	
	
//	存储
	function loginUser(){
		var user=$("#loginName").val();
		var upwd=$("#loginPwd").val();
		$.ajax({
			type:"post",
			url:"http://localhost:8080/smartCanteen/user/login.do",
			data:{
				uname:user,
				password:upwd
			},
			dataType:"json",
			success:function(data){	
				console.log(data);
				console.log(data.password);
				if(data!=null){
					alert("登录成功");
					//session存储
					sessionStorage.setItem("user",user);
					sessionStorage.setItem("upwd",upwd);
					window.location.href="index.html";
				}
			},
			error:function(error){
				$("#loginTip").css({
					visibility:'visible',//显示提示文字
				});
			}
		});
	}
	
	
	//点击登录
	$("#login").on("click",function(event){
		event.preventDefault();
		console.log("login");
		loginUser();
	});
});
