<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table width="100" cellpadding="0" cellspacing="0">
 <form action="/UserManage/doEdit" method="post">
  <tr><td>学号</td><td><input type="text" name="sno" value="${stu.sno }" readonly="readonly"/></td></tr>
   <tr><td>姓名</td><td><input type="text" name="sname" value="${stu.sname }" /></td></tr>
  <tr><td>密码</td><td><input type="password" name="password" value="${stu.password }"/></td></tr>
   <tr><td>专业</td><td><input type="text" name="major" value="${stu.major }"/></td></tr>
  <tr><td><input type="submit" value="修改"/></td><td>&nbsp;&nbsp;<a href="/UserManage/page">返回</a></td></tr>
  </form>
</table>

</body>
</html>