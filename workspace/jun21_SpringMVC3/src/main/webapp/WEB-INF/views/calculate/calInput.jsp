<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculate Input</title>
</head>
<body>
	<h1>사칙연산</h1>
	<form action="cal.do" name="calInputForm" method="get" onsubmit="return calCheck();">
		<table id="calTable">
			<tr>
				<td class="calTableTd" align="center" colspan="2">사칙연산</td>
			</tr>
			<tr>
				<td class="calTableTd" align="center">x</td>
				<td class="calTableTd2" align="center"><input name="x" autocomplete="off" placeholder="숫자 입력" value="${x }"></td>
			</tr>
			<tr>
				<td class="calTableTd" align="center">y</td>
				<td class="calTableTd2" align="center"><input name="y" autocomplete="off" placeholder="숫자 입력" value="${y }"></td>
			</tr>
			<tr>
				<td class="calTableTd2" colspan="2" align="center"><button>계산</button></td>
			</tr>
			<tr>
				<td class="calTableTd" align="center">결과</td>
				<td class="calTableTd2" align="center">
					<c:forEach var="r" items="${result }">
						${r }<br>
					</c:forEach>
				</td>
			</tr>
		</table>
	</form>
	<br>
	<h1>단위 변환</h1>
	<form action="trans.do" name="transInputForm" method="get" onsubmit="return transCheck();">
		<table>
			<tr>
				<td class="calTableTd" align="center" colspan="2">단위 변환</td>
			</tr>
			<tr>
				<td class="calTableTd" align="center">x</td>
				<td class="calTableTd2"><input name="xx" autocomplete="off" placeholder="숫자 입력"  value="${xx }"></td>
			</tr>
			<tr>
				<td class="calTableTd2" colspan="2" align="center"><button>변환</button></td>
			</tr>
			<tr>
				<td class="calTableTd" align="center">결과</td>
				<td class="calTableTd2" align="center">
					<c:forEach var="r2" items="${result2 }">
						${r2 }<br>
					</c:forEach>
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>