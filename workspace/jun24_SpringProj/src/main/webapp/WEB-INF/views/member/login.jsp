<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form action="login.do" name="loginInputForm" method="post" onsubmit="return loginCheck();">
		<table id="loginTable">
			<tr>
				<td class="loginTableTd" align="center" colspan="3">로그인</td>
			</tr>
			<tr>
				<td class="loginTableTd" align="center">ID</td>
				<td class="joinTableTd2" align="left"><input name="id" autocomplete="off"></td>
				<td class="joinTableTd3" align="center" rowspan="2"><button >로그인</button></td>
			</tr>
			<tr>
				<td class="loginTableTd" align="center">PASSWORD</td>
				<td class="joinTableTd2" align="left"><input name="pw" type="password"></td>
			</tr>
		</table>
	</form>
</body>
</html>