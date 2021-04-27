<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자용 주요일정 리스트</title>
<script src="./resources/js/jquery-latest.min.js"></script>
<link href="./resources/css/notice.css" rel="stylesheet">
</head>
<body>
<h2 class="title1"> |시험일정</h2>
	<table class="tabletool1">
		<tr>
			<th width="15%">날짜</th>
			<th width="55%">제목</th>
			<th width="15%">작성자</th>
			<th width="15%">작성일</th>
		</tr>
		<%-- <c:forEach var="i" items="${}"> --%>
		<c:forEach var="sl" items="${slist1}">
			<tr>
				<td>${sl.SCD_NUM} <input name="SCD_NUM"  type="hidden" value="${sl.SCD_NUM} " />
				</td>
				<td><a href="javascript:void(0);"
					onclick="btnclick('adm_scheduleCheck?SCD_NUM=${sl.SCD_NUM}')">${sl.SCD_TITLE}</a></td>
				<td>${sl.ADM_NAME}</td>
				<td><fmt:formatDate value="${sl.SCD_DATE}" pattern="yyyy년 MM월 dd일" /></td>
			</tr>
		</c:forEach>
		<%-- </c:forEach> --%>
	</table>
	<br>
		<button class="button" href="javascript:void(0);" onclick="btnclick('adm_scheduleInsert')">글쓰기</button>

   <!-- ajax 페이지 불러오는 부분 -->
   <script type="text/javascript">
      function btnclick(_url) { //onclick="btnclick(원하는 페이지)"클릭시 aj ax 실행
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