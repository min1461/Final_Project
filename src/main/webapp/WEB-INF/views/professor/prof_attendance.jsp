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
<h2>출석입력</h2>
<br><br>
<%-- <c:forEach var="?" items ="${}"> --%>
<table id="header">
<tr>
<td id="header1">과목명</td><td id="header2"><select name="professor_subject">
<option value="subject1"></option>
</select>
</td>
<%-- </c:forEach> --%>
<td id="header3">날짜</td><td id="header4"><input type="date" name="date"></td>
<td><input type="button" name="searchbtn" id="btn"  value="조회"></td> 
<!-- <td><input type="submit" name="h_ok" value="조회"></td>  -->
</tr>
</table>
</div>
<br>
<br>

<div class="attendance_section">
<%-- <c:forEach var="?" items ="${}"> --%>
<table id="section">
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
<br><br>
<input type="button" name="submit1" id="btn"  value="저장">
<input type="reset" id="btn"  value="취소">
<!-- <input type="submit" name="">저장 -->
</div>

</body>
</html>