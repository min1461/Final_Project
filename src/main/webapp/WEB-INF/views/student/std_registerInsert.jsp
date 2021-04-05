<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/scholarship.css" rel="stylesheet">
<title>수강신청</title>
</head>
<body>

	<div class="register_header">
		<h2 class="title1">|수강신청</h2>
		<br>
		<table class="apply">
			<tr>
				<th>학년도</th>
				<th>학기</th>
				<th>학과</th>
				<th>과목명</th>
				<th>학수번호</th>
				<th>조회</th>
			</tr>
<c:forEach var="su" items="${su1}">
			<tr>
				<td><select name="year_check">
						<option value="">학년도</option>
						<option value="year">2018년도</option>
						<option value="year">2019년도</option>
						<option value="year">2020년도</option>
						<option value="year">2021년도</option>
				</select></td>

				<td><select name="semester_check">
						<option value="">학기</option>
						<option value="semester">1학기</option>
						<option value="semester">2학기</option>
				</select></td>

				<td>${su.STU_MAJOR}</td>
				<td><input type="text" name="subject"></td>
				<td><input type="text" name="snumber"></td>


				<td><input type="submit" name="ok" value="조회"></td>
			</tr>
</c:forEach>
		</table>
	</div>
	<br>
	<br>

	<div class="register_section">
		<h3>개설과목 목록</h3>
		<table class="apply">
			<tr>
				<th>수강신청</th>
				<th>교과목코드</th>
				<th>교과목명</th>
				<th>학점</th>
				<th>교수명</th>
				<th>이수구분</th>
				<th>요일</th>
				<th>시간</th>
				<th>최대정원</th>
				<th>최소정원</th>
			</tr>
<c:forEach var="gae" items="${gae1}">
			<tr>
				<td><input type="submit" name="cancel" value="취소"></td>
				<td>${gae.SUB_NUM}</td>
				<td>${gae.SUB_NAME}</td>
				<td>${gae.GRA_HAK}</td>
				<td>${gae.PROF_NAME}</td>
				<td>${gae.SUB_STATE}</td>
				<td>${gae.SUB_DAY}</td>
				<td>${gae.SUB_TIME}</td>
				<td>${gae.SUB_MAX}</td>
				<td>${gae.SUB_MIN}</td>
			</tr>
</c:forEach>
		</table>
		<br>

		<h3>신청내역</h3>
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