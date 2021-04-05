<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="resources/css/adm_tuitiondepositApproval.css">
<body>
<h2 class="approval"> |장학금 승인</h2>
		
		<table class="tuitiondepositApproval">
		<tr>
		<th>년도</th> <th>학기</th> <th>학년</th> <th>이름</th> <th>장학금명</th> <th>신청일자</th> <th>승인</th>  
		</tr>
		<c:forEach var="janghak" items="${janghak1}">
		<tr>
		<td>${janghak.YEAR}</td> <td>${janghak.SEM_COUNT}</td> <td>${janghak.GRADES}</td> <td>${janghak.STU_NAME}</td> <td>${janghak.JANGHAKNAME}</td> <td>${janghak.DATE}</td> <td><input type="submit" name="app1" value="승인"></td> 
		</tr>
		</c:forEach>	
		</table>
</body>
</html>