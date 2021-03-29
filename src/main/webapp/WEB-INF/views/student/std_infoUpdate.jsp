<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-개인정보페이지</title>
<link href="./resources/css/std_infoUpdate.css" rel="stylesheet">
</head>
<body>
	<br>
	<div id="mypage">마이 페이지</div>
	<br />
	<table>
		<%-- <c:forEach var="sv" items="${sv}"> --%>
			<tr>
				<td id="profile" rowspan="5"></td>
				<td id="infomenu">학번</td>
				<td id="infovalue"><%-- ${sv.stu_NUM} --%></td>
				<td id="infomenu">성명(한글)</td>
				<td id="infovalue"></td>
				<td id="infomenu">성명(영문)</td>
				<td id="infovalue"></td>
				<td id="infomenu">소속대학</td>
				<td id="infovalue"></td>
			</tr>
			<tr>
				<td id="infomenu">전공</td>
				<td id="infovalue"></td>
				<td id="infomenu">생년월일</td>
				<td id="infovalue"></td>
				<td id="infomenu">국적</td>
				<td id="infovalue"></td>
				<td id="infomenu">신청학점/이수학점</td>
				<td id="infovalue">/</td>
			</tr>
			<tr>
				<td id="infomenu">주소</td>
				<td id="infovalue" colspan="3"></td>
				<td id="infomenu">전화번호</td>
				<td id="infovalue"></td>
				<td id="infomenu">이메일</td>
				<td id="infovalue"></td>
			</tr>
			<tr>
				<td id="infomenu">계좌번호</td>
				<td id="infovalue" colspan="3"></td>
				<td id="infomenu">총평점</td>
				<td id="infovalue"></td>
				<td id="infomenu">총평점평균</td>
				<td id="infovalue"></td>
			</tr>
			<tr>
				<td id="infomenu">입학일</td>
				<td id="infovalue"></td>
				<td id="infomenu">졸업일</td>
				<td id="infovalue"></td>
				<td id="infomenu">석차</td>
				<td id="infovalue"></td>
				<td id="infomenu">상태</td>
				<td id="infovalue"></td>
			</tr>
			<tr>
				<td id="profiletext">프로필 사진</td>
			</tr>
	</table>
</body>
</html>