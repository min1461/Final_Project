<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생관리</title>
</head>
<body>

<h2 class="title1"> |학생관리</h2>
<br>

<%-- <c:forEach var="?" items ="${}"> --%>
<table class="apply">
<tr><th>학번</th><th>학과</th>><th>이름</th><th>연락처</th><th>총학점</th></tr>
<c:forEach var="student" items="${chul1}">
<tr>
<td>${chul.STU_NUM}</td><td>${chul.STU_MAJOR}</td><td>${chul.STU_NAME}</td><td>${chul.STU_PHONENUM}</td><td>${chul.STU_TOTALAVE}</td>
</tr>
</c:forEach>
</table>
<%-- </c:forEach> --%>


</body>
</html>