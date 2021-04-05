<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>휴복학 신청</title>
</head>
<link rel="stylesheet" href="./resources/css/std_stateInsert.css">
<body>
	<h1 class="title">|휴복학 신청</h1>
	<form action="" method="post">
		<table class="std_stateinsert">

			<tr>
				<th scope="row">학과</th>
				<td><input type="text" class="text"></td>
				<th scope="row">학번</th>
				<td><input type="text" class="text"></td>
			</tr>

			<tr>
				<th scope="row">이름</th>
				<td><input type="text" class="text"></td>
				<th scope="row">전화번호</th>
				<td><input type="text" class="text"></td>
			</tr>

			<tr>
				<th scope="row">성별</th>
				<td><select name="gender">
						<option value="">성별선택</option>
						<option value="man">남자</option>
						<option value="woman">여자</option>
				</select></td>

				<th scope="row">첨부파일 제출방식</th>
				<td><select name="hewbok">
						<option value="">방식 선택</option>
						<option value="bang">방문제출</option>
						<option value="woo">우편</option>
						<option value="e-mail">이메일</option>
				</select></td>


			</tr>

			<tr>
				<th scope="row">휴학/복학 선택</th>
				<td><select name="reason">
						<option value="">휴학/복학 선택</option>
						<option value="normal">일반 휴학</option>
						<option value="military">군입대 휴학</option>
						<option value="mother">모성보호 휴학</option>
						<option value="back">복학</option>
						<option value="guitar">기타사항</option>
				</select></td>

				<th scope="row">세부사유</th>
				<td><input type="text" class="text"></td>
		</table>
		<input type="submit" class="btn" value="신청" />
	</form>


	<h1 class="title">|휴복학 조회</h1>
	<table class="std_stateinsert">
<c:forEach var="hew" items="${hew1}">
		<tr>
			<th scope="row">학과</th>
			<td>${hew1.STU_MAJOR}</td>
			<th scope="row">학번</th>
			<td>${hew1.STU_NUM}</td>
		</tr>

		<tr>
			<th scope="row">이름</th>
			<td>${hew1.STU_NAME}</td>
			<th scope="row">전화번호</th>
			<td>${hew1.STU_PHONENUM}</td>
		</tr>

		<tr>
			<th scope="row">성별</th>
			<td>${hew1.GENDER}</td>

			<th scope="row">첨부파일 제출방식</th>
			<td>${hew1.CHUMBU}</td>


		</tr>

		<tr>
			<th scope="row">휴학/복학 선택</th>
			<td>${hew1.VAC_NUM}</td>

			<th scope="row">세부사유</th>
			<td>${hew1.VAC_REASON}</td>
</tr>
</c:forEach>
	</table>

</body>
</html>