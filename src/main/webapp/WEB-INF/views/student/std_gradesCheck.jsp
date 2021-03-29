<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<tr>
		<td>2019</td> <td>1</td> <td>1</td> <td>전공</td> <td colspan="4">프로그래밍로직</td> <td>B+</td> <td>2</td> 
		</tr>
			
		</table>
	
</body>
</html>