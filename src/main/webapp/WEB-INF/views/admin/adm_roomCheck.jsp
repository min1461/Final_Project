<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/adm_roomCheck.css">
<body>
<h2 class="room_check"> |기숙사 배정</h2>
<table class="roomCheck">
		 <caption>표 제목</caption>
		<tr>
		<th>NO.</th> <th>학번</th> <th>이름</th> <th>신청상태</th>  <th>거주상태</th> <th>호실배정</th> 
		</tr>
		<c:forEach var="gisuk" items="${gisuk1}">
		<tr>
		<td>${gisuk.DOR_NUM}</td> <td>${gisuk.STU_NUM}</td> <td>${gisuk.STU_NAME}</td> <td>${gisuk.DOR_STA}</td>  <td>${gisuk.DOR_STA}</td> <td>${gisuk.DOR_ROM}</td> 
		</tr>
		</c:forEach>
		</table>
</body>
</html>