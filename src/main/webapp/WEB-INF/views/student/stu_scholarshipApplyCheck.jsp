<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/scholarship.css">
<title>장학금 신청 및 조회</title>
</head>
<body>


		<h2 class="title1"> |장학금 신청</h2>
		<br>
		<table class="apply">
		<tr>
		<th>학년도</th> <th>학기</th> <th>학년</th> <th>장학금명</th> <th>신청일자</th> <th>신청</th>  
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
	<td><select name="schname_check">
    <option value="">장학금명</option>
    <option value="schname">국가장학금Ⅰ</option>
    <option value="schname">국가장학금Ⅱ</option>
    <option value="schname">교내장학금</option>
    <option value="schname">하이서울장학금</option>
	</select></td> <td><input type="date" name="date1">
	</td> 
	<td><input type="submit" name="ok" value="신청">
	</td> 
		</tr>
			
		</table>
		<br><br><br><br><br><br>
		
		
		<h2 class="title1"> |장학금 조회</h2>
		<br>
		<table class="apply">
		<tr>
		<th>학년도</th> <th>학기</th> <th>학년</th> <th>장학금명</th> <th>신청일자</th> <th>처리상태</th>  
		</tr>
<c:forEach var="jang" items="${jang1}">
		<tr>
		<td>${jang.YEAR}</td> 
	
	<td>${jang.SEM_COUNT}</td> 
	<td>${jang.GRADES}</td> 
	<td>${jang.JANGNAME}</td> 
	<td>${jang.DATE}</td> 
	<td>${jang.SCH_STATE}</td> 
		</tr>
</c:forEach>
		</table>
	
</body>
</html>