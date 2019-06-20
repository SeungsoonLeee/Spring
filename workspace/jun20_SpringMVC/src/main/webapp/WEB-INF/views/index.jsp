<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HOME</title>
<link rel="stylesheet" type="text/css" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/test.js"></script>
</head>
<body>
	<img src="resources/img/lion2.png"><br>
	하이하이~ hello world<br>
	<form action="calPlus.do">
		x : <input name="x"><br>
		y : <input name="y"><br>
		<button onclick="isOk();">더하기</button><br>
		결과 : ${result }
	</form>
</body>
</html>