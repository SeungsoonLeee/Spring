<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/validCheck.js"></script>
<script type="text/javascript" src="resources/js/check.js"></script>
<title>INDEX PAGE</title>
</head>
<body>
	<table id="indexTable">
		<tr>
			<td align="center"><a href="home.go">HOME</a></td>
		</tr>
		<tr>
			<td align="center">
				<table id="siteMenuArea">
					<tr>
						<td align="center"><a href="">` 메뉴1</a></td>
						<td align="center"><a href="">┃ 메뉴2</a></td>
						<td align="center"><a href="">┏ 메뉴3</a></td>
						<td align="center"><a href="">└ 메뉴4</a></td>
						<td align="center"><a href="join.go">┐ 가입</a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table id="loginArea">
		<tr><td><jsp:include page="${loginPage }"></jsp:include> </td></tr>
	</table>
	<table id="contentArea">
		<tr>
			<td align="center"><jsp:include page="${contentPage }"></jsp:include></td>
		</tr>
	</table>
</body>
</html>