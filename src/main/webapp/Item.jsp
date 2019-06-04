<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Item.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<form action="Item/add.do">
		商品编号：<input type="text" name="itemid"><br />
		商家编号：<input type="text" name="orderid"><br />
		食物编号:<input type="text" name="foodid"> <br />
		食物名称:<input type="text" name="fname"><br />
		价格:<input type="text" name="price"><br />
		数量:<input type="text" name="number"><br /> 
		<input type="submit" value="添加">
	</form>
  </body>
</html>
