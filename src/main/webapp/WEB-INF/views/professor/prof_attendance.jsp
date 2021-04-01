<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/scholarship.css" rel="stylesheet">
<title>출석입력</title>
</head>
<body>

<div class="attendance_header">
<h2 class="title1"> |수강신청</h2>
<br><br>
<%-- <c:forEach var="?" items ="${}"> --%>
<table class="apply">
<tr>
<th>과목명</th>
<td>
<select name="professor_subject">
<option value="subject1"></option>
</select>
</td>
<%-- </c:forEach> --%>
<th>날짜</th>
<td><input type="date" name="date"></td>
<td><input type="submit" name="submit1" value="조회"></td> 
</tr>
</table>
</div>
<br>

<div class="attendance_section">
<%-- <c:forEach var="?" items ="${}"> --%>
<table class="apply">
<tr><th>학번</th><th>학과</th><th>이름</th><th>출석여부</th><th>출석구분</th></tr>
<tr><td>2014110561</td><td>예시</td><td>예시</td><td>예시</td>
<td><input type="radio" name="A" value="출석">출석
<input type="radio" name="A" value="지각">지각
<input type="radio" name="A" value="결석">결석</td></tr>

<tr><td></td><td></td><td></td><td></td>
<td><input type="radio" name="A" value="출석">출석
<input type="radio" name="A" value="지각">지각
<input type="radio" name="A" value="결석">결석</td></tr>

<tr><td></td><td></td><td></td><td></td>
<td><input type="radio" name="A" value="출석">출석
<input type="radio" name="A" value="지각">지각
<input type="radio" name="A" value="결석">결석</td></tr>
</table>
<%-- </c:forEach> --%>
<br>
<input type="submit" name="submit2" value="저장">
<input type="reset" id="btn"  value="취소">
<!-- <input type="submit" name="">저장 -->
</div>

</body>
</html>