/*
 * 忘记密码
 */
$(function(){
	var getCode;//验证码
	
	//获取验证码
	$("#getCode").on("click",function(event){
		event.preventDefault();
		var phonenum=$("#phonenum").val();
		if(phonenum==null || phonenum.length==0 || phonenum.length!=11){
			alert("请输入正确的手机号");
			return false;
		}
		$.ajax({
			type:"post",
			url:"getSsm.do",
			data:{
				number:phonenum,
			},
			dataType:"json",
			success:function(data){	
				getCode=data.code;//赋值
			},
			error:function(error){
				console.log(error);
			}	
		});
	})
	
	
	//修改密码
	$("#modifyPwd").on("click",function(event){
		event.preventDefault();
		var upwd=$("#upwd").val();
		var reupwd=$("#reupwd").val();
		var phonenum=$("#phonenum").val();
		var setCode=$("#code").val();//验证码
		
		if(upwd!=reupwd){
			alert("两次密码不相等!");
			return false;
		}
		
		if(getCode!=setCode){
			alert("验证码错误！");
			return false;
		}
		
		$.ajax({
			type:"post",
			url:"user/changePassword.do",
			data:{
				password:upwd,
				phoneNum:phonenum
			},
			dataType:"json",
			success:function(data){	
				console.log(data);
				if(data==true){
					alert("修改成功！(点击确定跳转到登录页面登录)");
				}
				window.location.href="login.html";//跳到登录
			},
			error:function(error){
				console.log(error);
			}	
		});
	})
})
