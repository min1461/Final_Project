<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-교수등록</title>

</head>
<body>

	<section>
		<h2>교수등록</h2>
		<form action="uploadtoserver.jsp" method="post"
			enctype="multipart/form-data">
			<!--  name 채워야합니다아 -->
			<table>
				<tr>
					<th>교수번호</th>
					<td><input type="text" name="" required></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name=""></td>
				<tr>
					<th>영문이름</th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td><input type="date" name=""></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="tel" name=""></td>
				</tr>
				<tr>
					<th>국적</th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th>사진</th>
					<td><input type="file" name="file"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="등록">
						<input type="reset" value="초기화"></td>
			</table>
		</form>
	</section>




</body>

</html>