<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu</title>

<style>	
	header { width: 100%; height: 150px; background: #d0d52f; }
	header ul li { float: left; width: 200px; height: 40px; background: #ff8204;
			border-radius: 10px; margin-right: 10px; padding-top: 5px;
			text-align: center;}
	header ul li a { text-decoration: none; display: block; font-size: 20pt;}
</style>
</head>
<body>
<%-- <%	if(loginUser == null){ %> --%>
<c:if test="${empty sessionScope.loginUser}">
	<header id="notLogin">
	<h1 style="font-size:40px;font-weight:bold;">Welcome First Web!!</h1>
		<ul style="list-style:none">
			<li><a href="/sample/home.jsp">home</a></li>
			<li><a href="nlist.do">공지사항</a></li>
		</ul>
	</header>
</c:if>
<c:if test="${not empty sessionScope.loginUser}">
	<header id="login">
	<h1 style="font-size:40px;">Welcome First Web!!</h1>
		<ul style="list-style:none">
			<li><a href="/sample/home.jsp">home</a></li>
			<li><a href="nlist.do">공지사항</a></li>
			<li><a href="/first/mdetail?userid=${loginUser.username }">내정보보기</a></li>
			<li><a href="logout.do" target="_top">로그아웃</a></li>
		</ul>
	</header>
</c:if> 
</body>
</html>








