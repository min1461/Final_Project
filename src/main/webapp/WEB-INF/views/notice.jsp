<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-공지사항</title>
<script src="http://false9.wckorea.gethompy.com/js/jquery-1.8.3.min.js"></script>
<link href="./resources/css/notice.css" rel="stylesheet">
</head>
<body>
<div class="center_page1">
	<table class="tabletool1">
		<caption class="notice"><img class="LS_img" src="./resources/img/LS.png"> 공지사항</caption>
		<tr class="tablecategory1">
			<th width="15%">번호</th>
			<th width="55%">제목</th>
			<th width="15%">작성자</th>
			<th width="15%">작성일</th>
		</tr>
		<%-- <c:forEach var="i" items="${}"> --%>
		<tr>
			<td>1</td>
			<td><a href="javascript:void(0);" onclick="btnclick('n_contents')">KG대학교 공지사항</a></td>
			<td>김민석</td>
			<td>2021-03-25</td>
		</tr>
		<%-- </c:forEach> --%>
	</table>
</div>
	
<div class="center_page2">
	<table class="tabletool2">
		<caption class="calendar"><img class="LS_img" src="./resources/img/CL.png"> 주요일정</caption>
		<tr class="tablecategory2">
			<th width="15%">날짜</th>
			<th width="55%">제목</th>
			<th width="15%">작성자</th>
			<th width="15%">작성일</th>
		</tr>
		<%-- <c:forEach var="i" items="${}"> --%>
		<tr>
			<td>2021-04-25</td>
			<td><a href="javascript:void(0);" onclick="btnclick('n_contents')">KG대학교 주요일정@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@</a></td>
			<td>김민석</td>
			<td>2021-03-25</td>
		</tr>
		<%-- </c:forEach> --%>
	</table>
</div>

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