<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success</title>
</head>
<body>
	
	<p>가입정보</p>
	<p>ID : ${m.id }</p>
	<p>이름 : ${m.name}</p>
	<p>생년월일 : <fmt:formatDate value="${m.birth}" type="date" dateStyle="long"/></p>
	<p>핸드폰 : ${m.phone}</p>
	<p>인사말 : ${m.comment}</p>
	<p>사진 : <img src="resources/img/${m.photo}"></p>
</body>
</html>