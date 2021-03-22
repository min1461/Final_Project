<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/css.css" rel="stylesheet">
<title>KG대학교 학사관리시스템</title>
</head>
<body>
<header>
<div class="head">
<img src ="./resources/img/long_logo.png" id="logo">
</div>
</header>

<!-- 학생 -->
<div class="main">
<a href="./views/main_std.jsp">
<div class="banner">
<img src = "./resources/img/stu.png" id="loginimg">
<span class="text">student</span>
</div>
</a>

<!-- 교수 -->
<a href="./views/main_prof.jsp">
<div class="banner">
<img src = "./resources/img/pro.png" id="loginimg">
<span class="text">professor</span>
</div>
</a>

<!-- 관리자 -->
<a href="./views/main_adm.jsp">
<div class="banner">
<img src = "./resources/img/admin.png" id="loginimg">
<span class="text">admin</span>
</div>
</a>
</div>

</body>
</html>