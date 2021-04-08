<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/scholarship.css" rel="stylesheet">

<title>수강신청</title>
</head>
<body>

<div class="register_header">
<h2 class="title1"> |수강신청 내역</h2>
<br>
<table class="apply">
		<tr>
		<th>년도</th> <th>학기</th> <th>조회</th>  
		</tr>

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


	<td><input type="submit" name="ok" value="조회">
	</td> 
		</tr>
			
		</table>
</div>
<br><br>

<div class="register_section">

<table class="except"><tr><td>신청학점</td><td>18</td></tr></table>
<table class="apply">
<tr><th>교과목코드</th><th>교과목명</th><th>학점</th><th>교수명</th><th>이수구분</th><th>요일</th><th>시간</th></tr>
<tr><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td></tr>
</table>
</div>

</body>
</html>