<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/attendance.css" rel="stylesheet">
<title>학생출석현황</title>
</head>
<body>

<div class="attendance_stuheader">
<h2>출석현황</h2>
<br>
<%-- <c:forEach var="?" items ="${}"> --%>
<table id="header">
<tr>
<td id="header5">년도</td>
<td id="header6">
<select name="year">
<option value="2021">2021</option>
<option value="2020">2020</option>
<option value="2019">2019</option>
<option value="2018">2018</option>
</select>
</td>
<%-- </c:forEach> --%>
<td id="header7">학기</td><td id="header8"><select name="semester">
<option value="1">1</option>
<option value="2">2</option>
</select></td></tr>
<tr>
<td id="header9">과목명</td><td id="header10">
<%-- <c:forEach var="?" items ="${}"> --%>
<select name="professor_subject">
<option value="subject1"></option>
</select>
<%-- </c:forEach> --%>
<td colspan="2" id="header11"><input type="submit" name="okokokok" id="btn" value="조회"></td>
</tr>
</table>
</div>
<br>
<br>




<div class="attendance_section">
<%-- <c:forEach var="?" items ="${}"> --%>
<table border=1>
<tr><th>날짜</th><th>수강과목</th><th>담당교수</th><th>출석</th><th>지각</th><th>결석</th></tr>
<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
</table>
<%-- </c:forEach> --%>
</div>

</body>
</html>