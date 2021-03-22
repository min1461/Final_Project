<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/index.css" rel="stylesheet">
<title>KG대학교 학사관리시스템</title>
</head>
<body>
	<header>
		<div class="head">
			<img src="./resources/img/long_logo.png" id="logo">
		</div>
	</header>

	<!-- 학생 -->
	<div class="main">
		<div class="banner">
			<a href="main_std">
				<img src="./resources/img/stu.png" id="loginimg"> 
				<span class="text">student</span>
			</a>
		</div>

		<!-- 교수 -->
		<div class="banner">
			<img src="./resources/img/pro.png" id="loginimg"> 
			<span class="text">professor</span>
		</div>

		<!-- 관리자 -->
		<div class="banner">
			<img src="./resources/img/admin.png" id="loginimg"> 
			<span class="text">admin</span>
		</div>
	</div>


</body>
</html>