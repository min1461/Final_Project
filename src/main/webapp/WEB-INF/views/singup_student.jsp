<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<%-- <%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-학생등록</title>
</head>

<body>

<section>
	<h2>학생등록</h2>
	<form action="#" method="post">
							<!--  name 채워야합니다아ㅏㅏㅏㅏ -->
		<table>
			<tr>
				<th>학번</th>
				<td><input type="text" name="" required></td>
			</tr>
			<tr>
				<th>전공</th>
				<td>
					<select name="">
						<option value="1">전공1
						<option value="2">전공2
						<option value="3">전공3
						<option value="4">전공4
						<option value="5">전공5
					</select>
				</td>
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
				<th>이메일</th>
				<td><input type="email" name="" value="123@abc.com"></td>
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
				<th>입학일</th>
				<td><input type="date" name=""></td>
			</tr>
			<tr>
				<th>사진</th>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="등록">
					<input type="reset" value="초기화">
				</td>
		</table>
	</form>
</section>

</body>
  
</html>