<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/scholarship.css" rel="stylesheet">
<title>학생출석현황</title>
</head>
<body>


<h2 class="title1"> |출석조회</h2>
<br>
<%-- <c:forEach var="?" items ="${}"> --%>
<table class="apply">
		<tr>
		<th>년도</th> <th>학기</th> <th>과목명</th> <th>조회</th>  
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
    <option value="">가져오기</option>
    <option value="grade">1</option>
    <option value="grade">2</option>
    <option value="grade">3</option>
    <option value="grade">4</option>
	</select></td> 

	<td><input type="submit" name="ok" value="조회">
	</td> 
		</tr>
			
		</table>
		<br><br><br><br><br><br>

<%-- <table class="apply">
<tr>
<td>년도</td>
<td>
<select name="year">
<option value="2021">2021</option>
<option value="2020">2020</option>
<option value="2019">2019</option>
<option value="2018">2018</option>
</select>
</td>
</c:forEach>
<td>학기</td><td><select name="semester">
<option value="1">1</option>
<option value="2">2</option>
</select></td>
<td>과목명</td><td>
<c:forEach var="?" items ="${}">
<select name="professor_subject">
<option value="subject1"></option>
</select></td>
<td colspan="2" id="header11"><input type="submit" name="okokokok" id="btn" value="조회"></td>

</c:forEach>
</tr>
</table> --%>



<div class="attendance_section">
<%-- <c:forEach var="?" items ="${}"> --%>
<table class="apply">
<tr><th>날짜</th><th>수강과목</th><th>담당교수</th><th>출석</th><th>지각</th><th>결석</th></tr>
<c:forEach var="chul" items="${chul1}">
<tr>
<td>${chul.DATE}</td><td>${chul.SUB_NAME}</td><td>${chul.PROF_NAME}</td><td>${chul.ATT_TOCUR}</td><td>${chul.ATT_jikak}</td><td>${chul.ATT_ABSENT}</td>
</tr>
</c:forEach>
</table>
<%-- </c:forEach> --%>
</div>

</body>
</html>