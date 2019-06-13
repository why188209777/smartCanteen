/*
 * account
 */
$(function(){
	//全局
	var getCode;//验证码
	
	
	//注册检验
	function registerInfo(){
		var uname=$("#userName").val();
		var uclass=$("#userClass").val();
		var userStuID=$("#UserStuID").val();
		var address=$("#userAddress").val();
		var upwd=$("#upwd").val();
		var reupwd=$("#reupwd").val();
		var phonenum=$("#phonenum").val();
		var setCode=$("#code").val();//验证码
		
		if(upwd!=reupwd){
			alert("两次密码不相等");
			return false;
		}
		
		if(getCode!=setCode){
			alert("验证码错误！");
			return false;
		}
		$.ajax({
			type:"post",
			url:"user/addUser.do",
			data:{
				uname:uname,
				studentid:userStuID,
				classes:uclass,
				phonenum:phonenum,
				address:address,
				password:upwd
			},
			dataType:"json",
			success:function(data){	
				console.log(data);
				if(data==true){
					alert("注册成功！(点击确定跳转到登录页面登录)");
				}
				window.location.href="login.html";//跳到登录
			},
			error:function(error){
				console.log(error);
			}	
		});
	}
	$("#register").on("click",function(event){
		event.preventDefault();
		registerInfo();
	})
	
	//获取验证码倒计时
	var getCode=document.getElementById("getCode");
	var countdown = 60;
	function settime(obj) {
	    if (countdown == 0) {
	        obj.removeAttribute("disabled");
	        obj.value="获取验证码";
	        countdown = 60;
	        return;
	    } else {
	        obj.setAttribute("disabled", true);
	        obj.value="重新发送(" + countdown + ")";
	        countdown--;
	    }
	setTimeout(function() {
	    settime(obj) }
	    ,1000)
	}
	
	//获取验证码
	$("#getCode").on("click",function(event){
		event.preventDefault();
		console.log("开始获取验证码！");
		var phonenum=$("#phonenum").val();
		if(phonenum==null || phonenum.length==0 || phonenum.length!=11){
			alert("请输入正确的手机号");
			return false;
		}
		settime(getCode);
		$.ajax({
			type:"post",
			url:"getSsm.do",
			data:{
				number:phonenum,
			},
			dataType:"json",
			success:function(data){	
				console.log(data);
				getCode=data.code;//赋值
			},
			error:function(error){
				console.log(error);
			}	
		});
	})
	
	//关闭模态框
	
	$(".clodeBox").on("click",function(event){
		$(".boxContainer").fadeOut();
	})
	
	$("#ccc").on("click",function(event){
		$(".boxContainer").fadeIn();
	})
})
