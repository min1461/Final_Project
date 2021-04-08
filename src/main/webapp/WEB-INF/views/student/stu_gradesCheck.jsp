<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/gradesCheck.css">
<body>


		<h2 class="sco_check"> |성적 확인</h2>
		<select name="semester_check">
    <option value="">년도,학년,학기를 선택하십시오</option>
    <option value="sm_check1">2018년도 1학년 1학기</option>
    <option value="sm_check2">2018년도 1학년 2학기</option>
    <option value="sm_check3">2019년도 2학년 1학기</option>
    <option value="sm_check4">2019년도 2학년 2학기</option>
    <option value="sm_check5">2020년도 3학년 1학기</option>
    <option value="sm_check6">2020년도 3학년 2학기</option>
    <option value="sm_check7">2021년도 4학년 1학기</option>
	</select>
		<table class="gradesCheck">
		 <caption>표 제목</caption>
		<tr>
		<th>연도</th> <th>학년</th> <th>학기</th> <th>구분</th> <th colspan="4">과목명</th> <th>성적</th> <th>학점</th> 
		</tr>
		<c:forEach var="sung" items="${sung1}">
		<tr>
		<td>${sung.YEAR}</td> <td>${sung.GRADES}</td> <td>${sung.SEM_COUNT}</td> <td>${sung.SUB_STATE}</td> <td colspan="4">${sung.SUB_NAME}</td> <td>${sung.GRA_RAN}</td> <td>${sung.GRA_HAK}</td> 
		</tr>
		</c:forEach>
		</table>
	
</body>
</html>