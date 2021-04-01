<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/adm_penaltyInsert.css">
<body>
<h1 class="register"> |벌점 등록</h1>
 <table class="penaltyInsert">
       <tr>
          <th scope="row">벌점코드</th>
          <td><input type="text" name="penalty_code" id="penalty_code"></td>
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
          <th scope="row">학생명</th>
          <td><input type="text" name="stu_name" id="stu_name"></td>
        </tr>
        <tr>
          <th scope="row">날짜</th>
          <td><input type='date' name="penalty_date" id="penalty_date"></td>
        </tr>
        <tr>
          <th scope="row">벌점</th>
          <td><select name="buljum">
    <option value="">벌점선택</option>
    <option value="penalty1">1</option>
    <option value="penalty2">2</option>
    <option value="penalty3">3</option>
	</select></td>
        </tr>
        <tr>
          <th scope="row">벌점사유</th>
          <td><input type="text" name="stu_name" id="stu_name"></td>
        </tr>
    </table>
<input type="submit" id="penalty_reg" value="등록" />
<input type="button" id="btn" value="취소" />
</body>
</html>