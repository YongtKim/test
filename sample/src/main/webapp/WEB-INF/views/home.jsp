<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Welcome Sample Project!
</h1>
<%@ include file="common/menu.jsp" %>
${loginUser }
<c:if test="${empty loginUser }">
<form action="login.do" method="post">
	<label>아이디 : <input type="text" name="userid" required="required"></label>
	<label>암호 : <input type="password" name="userpwd" required="required"></label>
	<input type="submit" value="로그인">
</form>
</c:if>
<c:if test="${not empty loginUser }">
	${loginUser.username }님 <a href="logout.do">로그아웃</a>
</c:if>
</body>
</html>
