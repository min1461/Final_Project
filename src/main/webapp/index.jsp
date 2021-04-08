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
		<a href="stu_login">
			<div class="banner">
				<img src="./resources/img/stu.png" id="loginimg">
				<span class="text">STUDENT</span>
			</div>
		</a>

		<!-- 교수 -->
		<a href="prof_login">
			<div class="banner">
				<img src="./resources/img/pro.png" id="loginimg"> 
				<span class="text">PROFESSOR</span>
			</div>
		</a>

		<!-- 관리자 -->
		<a href="adm_login">
			<div class="banner">
				<img src="./resources/img/admin.png" id="loginimg"> 
				<span class="text">ADMINISTER</span>
			</div>
		</a>
	</div>
</body>
</html>