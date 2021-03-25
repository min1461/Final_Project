<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KGUniversity_student</title>
<script src="http://false9.wckorea.gethompy.com/js/jquery-1.8.3.min.js"></script>
<link href="./resources/css/main.css" rel="stylesheet" type="text/css" >
</head>
<body>

   <!-- 로고 이미지 부분 -->
   <a onClick="window.location.reload()" style="cursor: pointer;">
   <div id="logo"></div>
   </a>
   
   <!-- 사이드 메뉴 부분 -->
   <div id="side_page">

      <div class="dropdown">
         <button class="dropbtn" href="javascript:void(0);" onclick="btnclick('notice')"><img src="./resources/img/arrow_blue_circle.png"> 공지사항</button>
      </div>

      <div class="dropdown">
         <button onclick="myFunction1()" class="dropbtn" ><img src="./resources/img/arrow_blue_circle.png"> 수업시스템</button>
         <div id="myDropdown1" class="dropdown-content">
            <a href="javascript:void(0);" onclick="btnclick('grades_chk')"><img src="./resources/img/arrow_red.png"> 성적확인</a>
            <a href="javascript:void(0);" onclick="btnclick('C.jsp')"><img src="./resources/img/arrow_red.png"> 강의평가</a>
            <a href="javascript:void(0);" onclick="btnclick('B.jsp')"><img src="./resources/img/arrow_red.png"> 출석조회</a>
         </div>
      </div>

      <div class="dropdown">
         <button onclick="myFunction2()" class="dropbtn" ><img src="./resources/img/arrow_blue_circle.png"> 수강시스템</button>
         <div id="myDropdown2" class="dropdown-content">
            <a href="javascript:void(0);" onclick="btnclick('B.jsp')"><img src="./resources/img/arrow_red.png"> 수강신청</a>
            <a href="javascript:void(0);" onclick="btnclick('C.jsp')"><img src="./resources/img/arrow_red.png"> 수강신청내역</a>
         </div>
      </div>

      <div class="dropdown">
         <button onclick="myFunction3()" class="dropbtn" ><img src="./resources/img/arrow_blue_circle.png"> 등록시스템</button>
         <div id="myDropdown3" class="dropdown-content">
            <a href="javascript:void(0);" onclick="btnclick('B.jsp')"><img src="./resources/img/arrow_red.png"> 등록금조회</a>
            <a href="javascript:void(0);" onclick="btnclick('C.jsp')"><img src="./resources/img/arrow_red.png"> 장학금 신청 및 조회</a> 
            <a href="javascript:void(0);" onclick="btnclick('B.jsp')"><img src="./resources/img/arrow_red.png"> 결제</a>
         </div>
      </div>

      <div class="dropdown">
         <button onclick="myFunction4()" class="dropbtn" ><img src="./resources/img/arrow_blue_circle.png"> 학적시스템</button>
         <div id="myDropdown4" class="dropdown-content">
            <a href="javascript:void(0);" onclick="btnclick('B.jsp')"><img src="./resources/img/arrow_red.png"> 개인정보 변경</a>
            <a href="javascript:void(0);" onclick="btnclick('C.jsp')"><img src="./resources/img/arrow_red.png"> 휴복학 신청 및 조회</a>
         </div>
      </div>

      <div class="dropdown">
         <button onclick="myFunction5()" class="dropbtn" ><img src="./resources/img/arrow_blue_circle.png"> 기숙사시스템</button>
         <div id="myDropdown5" class="dropdown-content">
            <a href="javascript:void(0);" onclick="btnclick('B.jsp')"><img src="./resources/img/arrow_red.png"> 입사신청</a>
            <a href="javascript:void(0);" onclick="btnclick('C.jsp')"><img src="./resources/img/arrow_red.png"> 벌점조회</a>
         </div>
      </div>

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

      //div안에 메인페이지 넣어놓음
      $(document).ready(function() {
         $("#center_page").load("just_main");
      });

      /* When the user clicks on the button, 
      toggle between hiding and showing the dropdown content */
      function myFunction1() {
         document.getElementById("myDropdown1").classList.toggle("show");
      }

      function myFunction2() {
         document.getElementById("myDropdown2").classList.toggle("show");
      }

      function myFunction3() {
         document.getElementById("myDropdown3").classList.toggle("show");
      }

      function myFunction4() {
         document.getElementById("myDropdown4").classList.toggle("show");
      }

      function myFunction5() {
         document.getElementById("myDropdown5").classList.toggle("show");
      }
   </script>

   <div id="logout">
      <input type="button" value="로그아웃" onclick="" />
   </div>

   <!-- 불러온 페이지 띄우는 부분 -->
   <div id="center_page"></div>

</body>
</html>