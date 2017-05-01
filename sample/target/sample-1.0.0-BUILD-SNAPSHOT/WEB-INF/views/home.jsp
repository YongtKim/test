<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	action.Home
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form action="member/login.do" method="post">
	<label>아이디 : <input type="text" name="userid" required="required"></label>
	<label>암호 : <input type="password" name="userpwd" required="required"></label>
	<input type="submit" value="로그인">
</form>
<br>
<div  style="background:black;width:100px;height:100px">
<a style="color:white">	${loginUser}</a>
</div>
</body>
</html>
