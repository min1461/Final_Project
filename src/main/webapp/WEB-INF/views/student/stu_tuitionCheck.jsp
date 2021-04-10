<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/scholarship.css">
<title>등록금 조회 및 결제</title>
</head>
<script type="text/javascript"
	src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.12.4.min.js"></script>

<script>
$("#tuipay").click(function () {
var IMP = window.IMP; 
IMP.init('imp44221020');
IMP.request_pay({
pg: 'inicis', 
/*
'kakao':카카오페이,
html5_inicis':이니시스(웹표준결제)
'nice':나이스페이
'jtnet':제이티넷
'uplus':LG유플러스
'danal':다날
'payco':페이코
'syrup':시럽페이
'paypal':페이팔
*/
pay_method: 'card',
/*
'samsung':삼성페이,
'card':신용카드,
'trans':실시간계좌이체,
'vbank':가상계좌,
'phone':휴대폰소액결제
*/
merchant_uid: 'merchant_' + new Date().getTime(),
name: '등록금',
amount: 100,
//가격
buyer_email: 'iamport@siot.do',
buyer_name: '이름',
buyer_tel: '010-1234-5678',
buyer_addr: '서울특별시 종로구',
buyer_postcode: '123-456',
m_redirect_url: ''

}, function (rsp) {
console.log(rsp);
if (rsp.success) {
var msg = '결제가 완료되었습니다.';
msg += '고유ID : ' + rsp.imp_uid;
msg += '상점 거래ID : ' + rsp.merchant_uid;
msg += '결제 금액 : ' + rsp.paid_amount;
msg += '카드 승인번호 : ' + rsp.apply_num;
} else {
var msg = '결제에 실패하였습니다.';
msg += '에러내용 : ' + rsp.error_msg;
}
alert(msg);
});
});
</script>



<body>
	<h2 class="title1">|등록금 조회 및 결제</h2>
<br>
<!-- 조회  -->
	<form action="" method="get" name="form1" id="form1" accept-charset='UTF-8'>
	
	<p>아임 서포트 결제 모듈 테스트 해보기</p>
<button id="check_module" type="button">아임 서포트 결제 모듈 테스트 해보기</button>
</p>



	<table class="apply">
	
		<tr>
			<th>학년도</th>
			<th>학기</th>
			<th>학과</th>
			<th>등록금액</th>
			<th>장학금액</th>
			<th>결제</th>
		</tr>

		<!-- 조회 불러오기 -->
	
			<tr>
		
				<td>2021</td>
				<td>1</td>
				<td>${joe.STU_MAJOR}</td>
				<td>${joe.TUI_FEE}</td>
				<td>${joe.SCH_PRICE}</td>
				<td><input type="button" id="tuipay" value="결제"></td>
	
			</tr>
		
	
	</table>
	</form>

	<br>
	<br>
	<br>
	<br>
	<br>
 <form action="" method="get" name="form1" id="form1" accept-charset='UTF-8'>
	<table class="apply">
		<tr>
				<th>학년도</th>
				<th>학기</th>
				<th>학년</th>
				<th>등록금액</th>
				<th>장학금액</th>
				<th>결제</th>
				
		</tr>

		<tr>
			<td><select name="year_check">
					<option value="">학년도</option>
					<option value="year">2018년도</option>
					<option value="year">2019년도</option>
					<option value="year">2020년도</option>
					<option value="year">2021년도</option>
			</select></td>
			<td>2</td>
			<td>3</td>
			<td>1000</td>
			<td>0</td>
			<td>
				<!-- <input type="submit" value="결제" onclick='pagemove(2)'> --> <input
				type="submit" id="tuipay" value="결제">
			</td>

			<c:forEach var="Kyeol" items="${Kyeol1}">


				<td><select name="semester_check">
						<option value="">학기</option>
						<option value="semester">1학기</option>
						<option value="semester">2학기</option>
				</select></td>

				<td><select name="grade_check">
						<option value="">학년</option>
						<option value="grade">1</option>
						<option value="grade">2</option>
						<option value="grade">3</option>
						<option value="grade">4</option>
				</select></td>
				<td>${Kyeol.TUI_FEE}</td>
				<td>${Kyeol.SCH_PRICE}</td>
				<td>
					<!-- <input type="submit" name="ok" value="결제" onclick=''> -->


				</td>
		</tr>
		<input type="hidden" id="tui" name='tui' value=100>
		<input type="hidden" id="id" name='id' value="Kyeol">
		</form>
		</c:forEach>
	</table> 

</body>
</html>