<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-공지사항</title>
<script src="./resources/js/jquery-latest.min.js"></script>
<link href="./resources/css/tuitiondepositCheck.css" rel="stylesheet">
</head>
<body>
	<h2 class="title1">|등록금 입금 조회</h2>
	<table class="tabletool1">
		<tr>
			<th width="12%">날짜</th>
			<th width="12%">학번</th>
			<th width="12%">이름</th>
			<th width="12%">은행</th>
			<th width="12%">계좌번호</th>
			<th width="12%">금액</th>
			<th width="28%">비고</th>
		</tr>
		<%-- <c:forEach var="i" items="${}"> --%>
		<c:forEach var="ipgeum" items="${ipgeum1}">
		<tr>
			<td>${ipgeum.DATE}</td>
			<td>${ipgeum.STU_NUM}</td>
			<td>${ipgeum.STU_NAME}</td>
			<td>${ipgeum.BANK}</td>
			<td>${ipgeum.STU_BANKACC}</td>
			<td>${ipgeum.TUI_FEE}</td>
			<td>${ipgeum.BIGO}</td>
		</tr>
		</c:forEach>
		<%-- </c:forEach> --%>
	</table>
</body>
</html>