<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/stu_joinInsert.css">
<body>
<h2 class="join"> |입사 신청</h2>
<form action="insertDor" method="post">
 <table class="std_joininsert">
         
        <tr>
          <th scope="row">학과</th>
          <td>${stu_VO.STU_MAJOR}
	</td>
	<th scope="row">주소</th>
          <td><input type="text" name="juso" value="${stu_VO.STU_ADDRESS}" placeholder="주소" style="width:500px;">
          
	</td>
	
        </tr>
        <tr>
          <th scope="row">학번</th>
          <td><input type="text" name="STU_NUM"></td>
          <th scope="row">이름</th>
          <td>${stu_VO.STU_NAME}</td>
        </tr>
        <tr>
          
          <th scope="row">전화번호</th>
          <td>${stu_VO.STU_PHONENUM}</td>
           <th scope="row">보호자 전화번호</th>
          <td><input type="text" name="DOR_PARN" id="parent_tel"></td>
        </tr>
        
        <tr>
          <th scope="row">보호자 이름</th>
          <td><input type="text" name="DOR_PANA" id="parent_name"></td>
          <th scope="row">보호자 관계</th>
          <td><input type="text" name="DOR_PAST" id="parent_rel"></td>
        </tr>
        
     
    </table>
    <br>
    <input type="submit" id="req" value="신청" />
</form>
</body>
</html>