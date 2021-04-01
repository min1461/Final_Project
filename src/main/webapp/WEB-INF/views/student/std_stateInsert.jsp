<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>휴복학 신청</title>
</head>
<link rel="stylesheet" href="./resources/css/std_stateInsert.css">
<body>
	<h1 class="title">|휴복학 신청</h1>
	<table class="std_stateinsert">

		<tr>
			<th scope="row">학과</th>
			<td><input type="text"></td>
			<th scope="row">학번</th>
			<td><input type="text"></td>
		</tr>

		<tr>
			<th scope="row">이름</th>
			<td><input type="text"></td>
			<th scope="row">전화번호</th>
			<td><input type="text"></td>
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
			<td><input type="text"></td>
	</table>
	<input type="submit" id="req" value="신청" />

</body>
</html>