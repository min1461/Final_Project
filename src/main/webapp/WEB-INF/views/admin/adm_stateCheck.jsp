<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/adm_stateCheck.css">
<body>
<h2 class="state_check"> |휴복학 승인</h2>
<table class="stateCheck">
		 <caption>표 제목</caption>
		<tr>
		<th>NO.</th> <th>학과</th> <th>학번</th> <th>이름</th>  <th>휴복학</th> <th>서류 제출상태</th> <th>승인</th> 
		</tr>
		<c:forEach var="hewbok" items="${hewbok1}">
		<tr>
		<td>${hewbok.VAC_NUM}</td> <td>${hewbok.STU_MAJOR}</td> <td>${hewbok.STU_NUM}</td> <td>${hewbok.STU_NAME}</td>  <td>${hewbok.VAC_REASON}</td> <td>${hewbok.MEJAECHUL}</td> <td><input type="submit" name="app1" value="승인"></td> 
		</tr>
		</c:forEach>
		</table>
</body>
</html>