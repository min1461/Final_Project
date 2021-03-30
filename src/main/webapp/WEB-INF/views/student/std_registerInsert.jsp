<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/class_registration.css" rel="stylesheet">
<title>수강신청</title>
</head>
<body>

<div class="register_header">
<h2>수강신청</h2>
<br>
<table>
<tr><th id="ten">구분</th>
<td><select name="year">
<option value="2021first">2021 1학기</option>
<option value="2021second">2021 2학기</option>
<option value="2020first">2020 1학기</option>
<option value="2020second">2020 2학기</option>
</select>
</td>
<th id="ten">학과</th><td><select name="major">
<option vlaue="get">가져오기</option>
</select></td>
<td><input type="submit" id="ok" value="조회"></td>
</tr>

<tr>
<th id="ten">과목명</th><td><input type="text" name="subject"></td>
<th id="ten">학수번호</th><td><input type="text" name="subjectnumber"></td>
</tr>
</table>
</div>
<br><br>

<div class="register_section">
<h3>개설과목 목록</h3>
<table>
<tr><th>수강신청</th><th>교과목코드</th><th>교과목명</th><th>학점</th><th>교수명</th><th>이수구분</th><th>요일</th><th>시간</th><th>최대정원</th><th>최소정원</th></tr>
<tr><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td></tr>
</table>
<br>

<h3>신청내역</h3> 
<table id="except"><tr><td>신청학점</td><td>18</td></tr></table>
<table>
<tr><th>수강취소</th><th>교과목코드</th><th>교과목명</th><th>학점</th><th>교수명</th><th>이수구분</th><th>요일</th><th>시간</th></tr>
<tr><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td><td>0</td></tr>
</table>
</div>

</body>
</html>