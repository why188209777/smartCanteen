/*
 * 
 * login
 */
$(function(){
	
	//	初始化
	function getInit(){
		var userid=sessionStorage.getItem("userid");
		var user=sessionStorage.getItem("user");
		var upwd=sessionStorage.getItem("upwd");
		if(user!=null){
			$("#loginUser").text(user);
			getUserInfo(userid);
		}
	}
	
	
	
	function getUserInfo(userid){
		$.ajax({
			type:"post",
			url:"user/getUserByUserId.do",
			data:{
				id:userid,
			},
			dataType:"json",
			success:function(data){	
				if(data!=null){
					fillUserInfo(data);
				}
			},
			error:function(error){
				console.log(error);
			}
		});
	}	
	
	
//	填充个人信息
	function fillUserInfo(data){
		var dom=$(".account_grid");
		dom.html("");
		var str="";
		var authState;
		if(data.status==0){
			authState="未认证";
		}else if(data.status==1){
			authState="已认证";
		}else if(data.status==2){
			authState="认证中";
		}else if(data.status==3){
			authState="认证失败";
		}
		
		str+=`
		<div class="col-md-6 login-left wow fadeInLeft" data-wow-delay="0.4s">
			<div class="register-top-grid">
				<h2>个人信息</h2>
				<div class="wow fadeInLeft" data-wow-delay="0.4s">
					<span>用户名<label>*</label></span>
					<input type="text" id="userName" value="${data.uname}" disabled="disabled">
				</div>
				<div class="wow fadeInRight" data-wow-delay="0.4s">
					<span>班级<label>*</label></span>
					<input type="text" id="userClass" value="${data.classes}" disabled="disabled">
				</div>
				<div class="wow fadeInRight" data-wow-delay="0.4s">
					<span>学号<label>*</label></span>
					<input type="text" id="UserStuID" value="${data.studentid}" disabled="disabled">
				</div>
				<div class="wow fadeInRight" data-wow-delay="0.4s">
					<span>地址<label>*</label></span>
					<input type="text" id="userAddress" value="${data.address}" disabled="disabled">
				</div>
				<div class="wow fadeInRight" data-wow-delay="0.4s">
					<span>手机<label>*</label></span>
					<input type="text" id="phonenum" value="${data.phonenum}" disabled="disabled">
				</div>
				<div class="wow fadeInRight" data-wow-delay="0.4s">
					<span>认证<label>*</label></span>
					<input type="text" id="phonenum" value="${authState}" disabled="disabled">
			`;
			if(data.status==0){
				authState="未认证";
				str+=`
					<a id="getAuth" style="cursor: pointer;">点击认证</a>
				`;
			}
			str+=`
				</div>
			</div>
		</div>
			`
			;
		
		dom.append(str);
	}
	
	
//	登录并存储
	function loginUser(){
		var user=$("#loginName").val();
		var upwd=$("#loginPwd").val();
		$.ajax({
			type:"post",
			url:"user/login.do",
			data:{
				uname:user,
				password:upwd
			},
			dataType:"json",
			success:function(data){	
				console.log(data);
				if(data!=null){
					alert("登录成功");
					//session存储
					sessionStorage.setItem("userid",data.id);
					sessionStorage.setItem("user",user);
					sessionStorage.setItem("upwd",upwd);
					window.location.href="index.html";
				}
			},
			error:function(error){
				console.log(error);
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
	
	getInit();
	
	
	
});
