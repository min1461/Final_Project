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
<h2 class="register"> |벌점 등록</h2>
<form action="insertPenalty" method="post">
 <table class="penaltyInsert">
      
        <tr>
          <th scope="row">학번</th>
          <td><input type="text" name="STU_NUM" id="stu_num"></td>
        </tr>
        
        <tr>
          <th scope="row">벌점</th>
          <td><select name="PEN_POI">
    <option value="">벌점선택</option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
	</select></td>
        </tr>
        <tr>
          <th scope="row">벌점사유</th>
          <td><input type="text" name="PEN_COM" id="PEN_COM"></td>
        </tr>
        <tr>
          <th scope="row">날짜</th>
          <td><input type='date' name="PEN_DATE" id="PEN_DATE"></td>
        </tr>
    </table><br>
<input type="submit" id="penalty_reg" value="등록" />
<input type="button" id="btn" value="취소" />
</form>
</body>
</html>