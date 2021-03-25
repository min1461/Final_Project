<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/attendance.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<div class="attendance_header">
<%-- <c:forEach var="?" items ="${}"> --%>
<table border=1 name="header">
<tr><td>과목명</td><td><select name="professor_subject">
<option value="subject1"></option>
</select></td>
<%-- </c:forEach> --%>
<td>
날짜<input type="date" name="date"></td></tr>
</table>
</div>
<br>
<br>

<div class="attendance_section">
<%-- <c:forEach var="?" items ="${}"> --%>
<table border=1>
<tr><td>학번</td><td>학과</td><td>이름</td><td>출석여부</td><td>출석구분</td></tr>
<tr><td></td><td></td><td></td><td></td>
<td><input type="radio" name="A" value="출석">출석
<input type="radio" name="A" value="지각">지각
<input type="radio" name="A" value="결석">결석</td></tr>
</table>
<%-- </c:forEach> --%>
<br><br>
<input type="button" name="submit1" value="저장">
<input type="reset" value="취소">
<!-- <input type="submit" name="">저장 -->
</div>

</body>
</html>