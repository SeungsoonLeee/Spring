<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Join Success</title>
</head>
<body>
	
	<p>가입정보</p>
	<p>ID : ${m.m_id }</p>
	<p>이름 : ${m.m_name}</p>
	<p>생년월일 : <fmt:formatDate value="${m.m_birth}" type="date" dateStyle="long"/></p>
	<p>인사말 : ${m.m_cmt}</p>
	<p>사진 : <img src="resources/img/${m.m_photo}"></p>
</body>
</html>