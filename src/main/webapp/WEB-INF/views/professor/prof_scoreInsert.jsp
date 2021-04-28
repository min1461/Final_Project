<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<link rel="stylesheet" href="./resources/css/scoreinsert.css">
<body>
<h1 class="register"> |성적 등록</h1>
 <table class="scoreinsert">
         
        <tr>
          <th scope="row">수강년도학기</th>
          <td><select name="semester">
    <option value="">학기선택</option>
    <option value="semester1">2020년도 1학기</option>
    <option value="semester2">2020년도 2학기</option>
    <option value="semester3">2021년도 1학기</option>
    <option value="semester4">2021년도 2학기</option>
	</select>
	</td>
        </tr>
    <tr>
          <th scope="row">학년</th>
          <td><select name="grades">
    <option value="">학년선택</option>
    <option value="grade1">1</option>
    <option value="grade2">2</option>
    <option value="grade3">3</option>
    <option value="grade4">4</option>
	</select>
	</td>
        </tr>
        <tr>
          <th scope="row">학과</th>
          <td><input type="text" name="department" id="department"></td>
        </tr>
        <tr>
          <th scope="row">교과목명</th>
          <td><input type="text" name="subject" id="subject"></td>
        </tr>
        
        <tr>
          <th scope="row">학생명</th>
          <td><input type="text" name="stu_name" id="stu_name"></td>
        </tr>
        <tr>
          <th scope="row">학점</th>
          <td><select name="hakjum">
    <option value="">학점선택</option>
    <option value="2">2</option>
    <option value="3">3</option>
    
	</select></td>
        </tr>
        <tr>
          <th scope="row">성적</th>
          <td><select name="stu_name">
    <option value="">성적선택</option>
    <option value="A+">A+</option>
    <option value="A">A</option>
    <option value="B+">B+</option>
    <option value="B">B</option>
    <option value="C+">C+</option>
    <option value="C">C</option>
    <option value="D+">D+</option>
    <option value="D">D</option>
    <option value="F">F</option>
	</select></td>
        </tr>
    </table>
<input type="submit" id="check" value="확인" />
<input type="button" id="btn" value="취소" />


</body>
</html>