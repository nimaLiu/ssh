<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
  <form action="/UserManage/doLogin " method="post">
<table width="250" height="140" cellpadding="0" cellspacing="0" border="0" style="text-align: center">
  <tr><td>学号</td><td><input type="text" name="sno"/></td></tr>
  <tr><td>密码</td><td><input type="password" name="password"/></td></tr>
  <tr><td><input type="submit" value="登录"/></td><td><a href="/UserManage/regist">注册</a></td></tr>
</table>
<p style="color: red">${tip }</p>
</form>
</body>
</html>