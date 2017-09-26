<%@page import="com.lx.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"
    pageEncoding="utf-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>主页</title>
 <script type="text/javascript">
    	function del_sure(){ 
    		
    		if (confirm("你确定要删除吗?") ==true){ 
    		return true; 
    		} 
    		else{ 
    		return false; 
    		} 
    		} 
    
 </script>
</head>
<body>
    <p>欢迎!!</p>
    <a href="/UserManage/add">添加学生</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/UserManage/page">主页</a> 
    <br>  <br> 
     
    <form action="/UserManage/search" method="post"> 
    <input name="sname" placeholder="按名字查询" type="text"/> <input type="submit" value="查询"  />
    </form>
    <br>
    <table border="1" width="800" cellpadding="0" cellspacing="0" style="text-align: center">
      <tr><th>学号</th><th>专业</th><th>密码</th><th>姓名</th><th>修改</th><th>删除</th></tr>
      <c:forEach items="${all }" var="student">
      <tr>
      <td>${student.sno }</td><td>${student.major }</td>
      <td>${student.password }</td><td>${student.sname}</td>
      <td><a href="/UserManage/edit?sno=${student.sno }">修改</a></td>
      <td><a href="/UserManage/del?sno=${student.sno }" onclick="return del_sure()">删除</a></td>
      </tr>
      </c:forEach>
     
     </table>
      <c:if test="${all.size()==0 }">对不起，您所查询的用户不存在！！！</c:if>
   
</body>
</html>