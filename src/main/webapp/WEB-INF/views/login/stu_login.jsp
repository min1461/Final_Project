<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<link rel="stylesheet" href="./resources/css/stu_login.css">
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$('#slide3>ul>li').hide();
	$('#slide3>ul>li:first-child').show();
	setInterval(function() {
		$('#slide3>ul>li:first-child').fadeIn().next().fadeOut().end(1000)
				.appendTo('#slide3>ul');
	}, 3000);
</script>

<script>
	$(document).ready(function() {

		$("#submit").on("click", function() {
			if ($("#HAKBUN").val() == "") {
				alert("아이디를 입력해주세요.");
				$("#HAKBUN").focus();
				return false;
			}
			if ($("#HAK_PW").val() == "") {
				alert("비밀번호를 입력해주세요.");
				$("#HAK_PW").focus();
				return false;
			}

		});
	})
</script>

<body>
	<header></header>
	<nav>
		<img src="./resources/img/logo.png" alt="로고타이틀">
	</nav>
	<span class="kg">KG대학교</span>
	<span class="info">종합정보시스템 </span>

	<section>
		<article>
			<div id="slide3">
				<ul>
					<li><img src="./resources/img/uni1.png" alt="슬라이드1"></li>
					<li><img src="./resources/img/uni2.png" alt="슬라이드2"></li>
					<li><img src="./resources/img/uni3.png" alt="슬라이드3"></li>
				</ul>
			</div>
		</article>


		<form action="stu_main" method="get">
			<div id="login_box">
				<h2>LOGIN</h2>
				<ul id="input_button">
					<li id="id_pass">
						<ul>
							<li id="id"><span style="font-size: 14px;">학번</span> <input
								type="text" name="HAKBUN" id="HAKBUN"
								style="width: 180px; height: 20px;"></li>
							<!-- id -->
							<li id="pass"><span style="font-size: 14px;">PW</span> <input
								type="password" name="HAK_PW" id="HAK_PW"
								style="width: 180px; height: 20px;"></li>
							<!-- pass -->
						</ul>
					</li>
					<li id="login_btn">
						<button type="submit" id="submit">
							<b>로그인</b>
						</button>
					</li>
				</ul>
				<ul id="btns">
					<li>비밀번호 찾기</li>
				</ul>
			</div>
		</form>
	</section>
	<footer>
		<span class="main_text">개인정보처리방침 | 보안진단의 날</span>
		<p class="sub_text">35938 서울시 노원구 화랑로 621 KG대학교 Tel. 02-970-5114 /
			Fax. 02-978-793</p>
		<p class="sub_text2">Copyright 2013 SEOUL KG'S UNIVERSITY. All
			Rights Reversed.</p>
	</footer>
</body>
</html>