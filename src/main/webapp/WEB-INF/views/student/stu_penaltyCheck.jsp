<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/stu_penaltyCheck.css">
<body>


		<h2 class="penalty_check"> |벌점 조회</h2>
	
		<table class="penaltyCheck">
		 <caption>표 제목</caption>
		<tr>
		<th>벌점코드</th> <th>날짜</th> <th>학번</th> <th>벌점</th> <th>벌점사유</th>  
		</tr>
		<c:forEach var="bul" items="${bul1}">
		<tr>
		<td>${bul.PEN_NUM}</td> <td>${bul.PEN_DATE}</td> <td>${bul.STU_NUM}</td> <td>${bul.PEN_POI}</td> <td>${bul.PEN_COM}</td> 
		</tr>
		</c:forEach>
		</table>
	
</body>
</html>