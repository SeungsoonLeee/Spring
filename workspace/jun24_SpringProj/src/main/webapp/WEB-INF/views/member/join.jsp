<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Join Page</title>
</head>
<body>
	<h1>가입하기</h1>
	<form action="join.do" name="joinInputForm" method="post" enctype="multipart/form-data" onsubmit="return joinCheck();">
		<table id="joinTable">
			<tr>
				<td class="joinTableTd" align="center" colspan="2">가입</td>
			</tr>
			<tr>
				<td class="joinTableTd" align="center">ID</td>
				<td class="joinTableTd2" align="left"><input name="id" autocomplete="off"></td>
			</tr>
			<tr>
				<td class="joinTableTd" align="center">PASSWORD</td>
				<td class="joinTableTd2" align="left"><input name="pw" type="password"></td>
			</tr>
			<tr>
				<td class="joinTableTd" align="center">PASSWORD CHECK</td>
				<td class="joinTableTd2" align="left"><input name="pwCheck" type="password"></td>
			</tr>
			<tr>
				<td class="joinTableTd" align="center">NAME</td>
				<td class="joinTableTd2" align="left"><input name="name" autocomplete="off"></td>
			</tr>
			<tr>
				<td class="joinTableTd" align="center">BIRTH</td>
				<td class="joinTableTd2" align="left">
					<input name="birth2" autocomplete="off" maxlength="6" placeholder="910101">
				</td>
			</tr>
			<tr>
				<td class="joinTableTd" align="center">COMMENT</td>
				<td class="joinTableTd2" align="left"><textarea name="comment" rows="3" cols="30"></textarea></td>
			</tr>
			<tr>
				<td class="joinTableTd" align="center">PHOTO</td>
				<td class="joinTableTd2" align="left"><input type="file" name="photo"></td>
			</tr>
			<tr>
				<td class="joinTableTd2" colspan="2" align="center">
					<button>가입</button>
					<button type="reset">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>