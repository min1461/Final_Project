<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./resources/css/tui.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container">
		<table style="border:1px solid; width:100%;">		
			<caption class="maintitle">등록금 조회</caption>
				<tr>
					<td class="title">성명</td>
					<td class="sub"></td>
					<td class="title">주민등록번호</td>
					<td colspan="2" class="sub"></td>
					<td class="title">주소</td>
					<td colspan="4" class="sub"></td>

				</tr>
				<tr>
					<td class="title">학교명</td>
					<td class="sub"></td>
					<td class="title">년도</td>
					<td class="sub"></td>
					<td class="title">학기</td>
					<td class="sub"></td>
					<td class="title">학과</td>
					<td class="sub"></td>
					<td class="title">학년</td>
					<td class="sub"></td>
				</tr>
				<tr>
					<td colspan="2" class="title">입학금</td>
					<td colspan="3" class="sub"></td>
					<td colspan="2" class="title">수업료</td>
					<td colspan="3" class="sub"></td>
				</tr>
				<tr>
					<td colspan="10" class="title2">총 등록금</td>
				</tr>
				<tr>
					<td colspan="10" class="sub2"></td>
				</tr>
		</table>
	</div>
	
	


		<h2 class="title1"> |등록금 결제</h2>
		
		<table class="apply">
		<tr>
		<th>학년도</th> <th>학기</th> <th>학년</th> <th>등록금액</th> <th>장학금액</th> <th>결제</th>  
		</tr>

		<tr>
		<td><select name="year_check">
    <option value="">학년도</option>
    <option value="year">2018년도</option>
    <option value="year">2018년도</option>
    <option value="year">2019년도</option>
    <option value="year">2019년도</option>
    <option value="year">2020년도</option>
    <option value="year">2020년도</option>
    <option value="year">2021년도</option>
	</select></td> 
	
	<td><select name="semester_check">
    <option value="">학기</option>
    <option value="semester">1학기</option>
    <option value="semester">2학기</option>
	</select></td> 
	<td><select name="grade_check">
    <option value="">학년</option>
    <option value="grade">1</option>
    <option value="grade">2</option>
    <option value="grade">3</option>
    <option value="grade">4</option>
	</select></td> 
	<td>얼마</td> <td>얼마</td> 
	<td><input type="submit" name="ok" value="결제">
	</td> 
		</tr>
			
		</table>


</body>
</html>