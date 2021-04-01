<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/scholarship.css" rel="stylesheet">

<title>강의평가</title>

<!-- <script> //강의평가 팝업창 열기
function popup() { window.open("std_popupInsert.jsp", "popup", "width=900, height=800, left=80%, top=5%"); }
</script> -->
</head>
<body>

<h2 class="title1"> |전체 강의평가</h2>
<br>
<table class="apply">
		<tr>
		<th>학년도</th> <th>학기</th> <th>교수명</th> <th>과목명</th> <th>조회</th>  
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
	
	<td><input type="text" name="subject"></td>
	<td><input type="text" name="snumber"></td>


	<td><input type="submit" name="ok" value="조회">
	</td> 
		</tr>
			
		</table>
<br><br>

<table class="apply">
		<tr>
		<th>학년도</th> <th>학기</th> <th>교수명</th> <th>과목명</th> <th>강의평가</th>  
		</tr>

		<tr>
		<td>가져오기</td> 
		<td>가져오기</td> 
		<td>가져오기</td> 
		<td>가져오기</td> 

	<td><input type="button" name="ok" value="평가하기" onclick="btnclick('std_popupInsert')"></td> 
		</tr>
			
		</table>



</body>
</html>