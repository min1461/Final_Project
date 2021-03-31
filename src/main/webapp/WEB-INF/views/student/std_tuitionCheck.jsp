<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/scholarship.css">
<title>등록금 조회 및 결제</title>
</head>
<!-- <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>

<script>
//결제 넣을 곳
</script> -->

<body>
<h2 class="title1"> |등록금 조회 및 결제</h2>
		
		<table class="apply">
		<tr>
		<th>성명</th> <th>학번</th> <th>학과</th> <th>주소</th>
		</tr>

		<tr>
		<td>가져오기</td>
	    <td>가져오기</td> 
		<td>가져오기</td> 
		<td>가져오기</td> 
	
		</tr>
			
		</table>
		
<br><br><br><br><br>
		
		<table class="apply">
		<tr>
		<th>학년도</th> <th>학기</th> <th>학년</th> <th>등록금액</th> <th>장학금액</th> <th>결제</th>  
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