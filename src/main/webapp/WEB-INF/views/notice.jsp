<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-공지사항</title>
<link href="./resources/css/notice.css" rel="stylesheet">
</head>
<body>
<div class="center_page1">
	<table class="tabletool1">
		<caption class="notice"><img class="LS_img" src="./resources/img/LS.png"> 공지사항</caption>
		<tr class="tablecategory1">
			<th width="5%">번호</th>
			<th width="55%">제목</th>
			<th width="15%">작성자</th>
			<th width="25%">작성일</th>
		</tr>
		<%-- <c:forEach var="i" items="${}"> --%>
		<tr>
			<td>1</td>
			<td>KG대학교 공지사항</td>
			<td>김민석</td>
			<td>2021-03-25</td>
		</tr>
		<%-- </c:forEach> --%>
	</table>
</div>
	
<div class="center_page2">
	<table class="tabletool2">
		<caption class="calendar"><img class="LS_img" src="./resources/img/CL.png"> 주요일정</caption>
		<tr class="tablecategory2">
			<th width="25%">날짜</th>
			<th width="40%">제목</th>
			<th width="10%">작성자</th>
			<th width="25%">작성일</th>
		</tr>
		<%-- <c:forEach var="i" items="${}"> --%>
		<tr>
			<td>2021-04-25</td>
			<td>KG대학교 주요일정@@@@@@@@@@@@@@@@@@@@</td>
			<td>김민석</td>
			<td>2021-03-25</td>
		</tr>
		<%-- </c:forEach> --%>
	</table>
</div>
</body>
</html>