<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/scholarship.css" rel="stylesheet">
<title>수강신청</title>
</head>
<body>

	<h2 class="title1">|수강신청</h2>
	<div class="register_section">
		<h3>개설과목 목록</h3>
		<br>
		<table class="apply">
			<tr>
				<th>수강신청</th>
				<th>교과목코드</th>
				<th>교수번호</th>
				<th>과목명</th>
				<th>강의시간(교시)</th>
				<th>강의실</th>
				<th>수강시작일</th>
				<th>수강종료일</th>
				<th>최대정원</th>
				<th>최소정원</th>
				<th>이수구분</th>
			</tr>
			<form action="stu_registerInsertProcess">
				<c:forEach var="gae" items="${sub_VO}">
					<tr>
						<td><input type="submit" name="submit" value="신청"></td>
						<td>${gae.SUB_NUM}<input type="hidden" name="SUB_NUM"
							value="${gae.SUB_NUM}" /></td>
						<td>${gae.PROF_NUM}</td>
						<td>${gae.SUB_NAME}</td>
						<td>${gae.SUB_TIME}</td>
						<td>${gae.SUB_ROOM}</td>
						<td>${gae.SUB_STADAY}</td>
						<td>${gae.SUB_ENDDAY}</td>
						<td>${gae.SUB_MAX}</td>
						<td>${gae.SUB_MIN}</td>
						<td>${gae.SUB_STATE}</td>
					</tr>
				</c:forEach>
			</form>
		</table>
		<br>

		<h3>신청내역</h3>
		<br>
		<table id="except">
			<c:forEach var="shin" items="${shin1}">
				<tr>
					<td>신청학점</td>
					<td>${shin.STU_APPCRE}</td>
				</tr>
			</c:forEach>
		</table>
		<table class="apply">
			<tr>
				<th>수강취소</th>
				<th>교과목코드</th>
				<th>교과목명</th>
				<th>학점</th>
				<th>교수명</th>
				<th>이수구분</th>
				<th>요일</th>
				<th>시간</th>
			</tr>
			<c:forEach var="shin2" items="${shin2}">
				<tr>
					<td>${shin2.CANCEL}</td>
					<td>${shin2.SUB_NUM}</td>
					<td>${shin2.SUB_NAME}</td>
					<td>${shin2.GRA_HAK}</td>
					<td>${shin2.PROF_NAME}</td>
					<td>${shin2.SUB_STATE}</td>
					<td>${shin2.SUB_DAY}</td>
					<td>${shin2.SUB_TIME}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>