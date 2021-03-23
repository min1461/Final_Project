<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-강의등록</title>
</head>
<body>
	
<section>
	<h2>강의등록</h2>
	<form action="#">
							<!--  name 채워야합니다아ㅏㅏㅏㅏ -->
		<table>
			<tr>
				<th>구분</th>
				<td>			
					<select name="">
						<option value="">전공필수
						<option value="">전공선택
						<option value="">교양
					</select>
				</td>
			</tr>
			<tr>
				<th>과목명</th>
				<td><input type="text" name="" required></td>
			</tr>
			<tr>
				<th>교수명</th>
				<td><input type="text" name=""></td>
			<tr>
			<tr>
				<th>강의요일</th>
				<td>
					<input type="radio" name="" value="mon">월요일
					<input type="radio" name="" value="tue">화요일
					<input type="radio" name="" value="wed">수요일
					<input type="radio" name="" value="thu">목요일
					<input type="radio" name="" value="fri">금요일
					
				</td>
			</tr>
			<tr>
				<th>강의시간</th>
				<td>
					<input type="checkbox" name="time" value="9">09:00
					<input type="checkbox" name="time" value="10">10:00
					<input type="checkbox" name="time" value="11">11:00
					<input type="checkbox" name="time" value="12">12:00
					<input type="checkbox" name="time" value="13">13:00<br>
					<input type="checkbox" name="time" value="14">14:00
					<input type="checkbox" name="time" value="15">15:00
					<input type="checkbox" name="time" value="16">16:00
					<input type="checkbox" name="time" value="17">17:00
					<input type="checkbox" name="time" value="18">18:00
				</td>
			<tr>
				<th>수강시작일</th>
				<td><input type="date" name=""></td>
			</tr>
			<tr>
				<th>수강종료일</th>
				<td><input type="date" name=""></td>
			</tr>
			<tr>
				<th>최소정원</th>
				<td><input type="text" name=""></td>
			</tr>
			<tr>
				<th>최대정원</th>
				<td><input type="text" name=""></td>
			</tr>
			<tr>
				<th>교재</th>
				<td><input type="text" name=""></td>
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