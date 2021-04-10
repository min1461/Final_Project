<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/stu_joinInsert.css">
<body>
<h2 class="join"> |입사 신청</h2>
 <table class="std_joininsert">
         
        <tr>
          <th scope="row">학과</th>
          <td><input type="text" name="department" id="department">
	</td>
	<th scope="row">주소</th>
          <td><input type="text" name="juso" placeholder="주소" style="width:500px;">
          
	</td>
	
        </tr>
        <tr>
          <th scope="row">학번</th>
          <td><input type="text" name="hakbun" id="hakbun"></td>
          <th scope="row">이름</th>
          <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
          
          <th scope="row">전화번호</th>
          <td><input type="text" name="tel" id="tel"></td>
           <th scope="row">보호자 전화번호</th>
          <td><input type="text" name="parent_tel" id="parent_tel"></td>
        </tr>
        
        <tr>
          <th scope="row">보호자 이름</th>
          <td><input type="text" name="parent_name" id="parent_name"></td>
          <th scope="row">보호자 관계</th>
          <td><input type="text" name="parent_rel" id="parent_rel"></td>
        </tr>
        
     
    </table>
    <br>
    <input type="submit" id="req" value="신청" />

</body>
</html>