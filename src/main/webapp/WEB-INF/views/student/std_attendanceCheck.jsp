<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="attendance_header">

년도 <select name="year">
<option value="2021">2021</option>
<option value="2020">2020</option>
<option value="2019">2019</option>
<option value="2018">2018</option>
</select>

학기 <select name="semester">
<option value="1">1</option>
<option value="2">2</option>
</select>
<br>
<br>

<%-- <c:forEach var="?" items ="${}"> --%>
과목<select name="professor_subject">
<option value="subject1"></option>
</select>
<%-- </c:forEach> --%>
</div>
<br>
<br>

<div class="attendance_section">
<%-- <c:forEach var="?" items ="${}"> --%>
<table border=1>
<tr><td>날짜</td><td>수강과목</td><td>담당교수</td><td>출석</td><td>지각</td><td>결석</td></tr>
<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
</table>
<%-- </c:forEach> --%>
</div>

</body>
</html>