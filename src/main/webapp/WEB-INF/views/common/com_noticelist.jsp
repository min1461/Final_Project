<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-공지사항</title>
<script src="./resources/js/jquery-latest.min.js"></script>
<link href="./resources/css/notice.css" rel="stylesheet">
</head>
<body>
<h2 class="title1"> |공지사항</h2>
	<table class="tabletool1">
		<tr>
			<th width="15%">번호</th>
			<th width="55%">제목</th>
			<th width="15%">작성자</th>
			<th width="15%">작성일</th>
		</tr>
		<%-- <c:forEach var="i" items="${}"> --%>
		<c:forEach var="nl" items="${nlist}">
		<tr>
			<td>${nl.ANN_NUM} <input name="ANN_NUM"  type="hidden" value="${nl.ANN_NUM} " />
			</td>
			<td><a href="javascript:void(0);"
				onclick="btnclick('com_noticeCheck?ANN_NUM=${nl.ANN_NUM}')">${nl.ANN_TITLE}</a></td>
			<td>${nl.ANN_HEAD}</td>
			<td>${nl.ANN_DATE}</td>
		</tr>
		</c:forEach>
		<%-- </c:forEach> --%>
	</table>


   <!-- ajax 페이지 불러오는 부분 -->
   <script type="text/javascript">
      function btnclick(_url) { //onclick="btnclick(원하는 페이지)"클릭시 ajax 실행
         $.ajax({
            url : _url, //호출 url 설정, GET방식일경우 뒤에 파라티터를 붙여서 사용해도됨
            type : 'post', //전송방식을 지정한다 get, post
            //datatype : //Ajax를 통해 호출한 페이지의 Return 형식이다. 형식에 따라 xml, json, html, text 등을 사용하면 됨
            success : function(data) { //성공했을때의 처리 부분, 해당부분에서 데이터 핸들링
               $('#center_page').html(data); //div에 받아온 값을 넣는다
            },
            error : function() { //에러났을때의 처리 부분
               $('#center_page').text('페이지 점검중 입니다.'); //에러
            }
         });
      }
	</script>
</body>
</html>