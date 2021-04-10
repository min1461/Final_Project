<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/scholarship.css">
<title>등록금 조회 및 결제</title>
</head>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>

<script>
$("#tuipay").click(function () {
var IMP = window.IMP; // 생략가능
IMP.init('imp44221020');
// 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드
IMP.request_pay({
pg: 'inicis', // version 1.1.0부터 지원.
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
/*
merchant_uid에 경우
https://docs.iamport.kr/implementation/payment
위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.
참고하세요.
나중에 포스팅 해볼게요.
*/
name: '주문명:결제테스트',
//결제창에서 보여질 이름
amount: 1000,
//가격
buyer_email: 'iamport@siot.do',
buyer_name: '구매자이름',
buyer_tel: '010-1234-5678',
buyer_addr: '서울특별시 종로구',
buyer_postcode: '123-456',
m_redirect_url: 'https://www.yourdomain.com/payments/complete'
/*
모바일 결제시,
결제가 끝나고 랜딩되는 URL을 지정
(카카오페이, 페이코, 다날의 경우는 필요없음. PC와 마찬가지로 callback함수로 결과가 떨어짐)
*/
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
<h2 class="title1"> |등록금 조회 및 결제</h2>
		<br> 
		<table class="apply">
		<tr>
		<th>성명</th> <th>학번</th> <th>학과</th> <th>주소</th>
		</tr>
<c:forEach var="joe" items="${joe1}">
		<tr>
		<td>${joe.STU_NAME}</td>
	    <td>${joe.STU_NUM}</td> 
		<td>${joe.STU_MAJOR}</td> 
		<td>${joe.STU_ADDRESS}</td> 
	
		</tr>
</c:forEach>			
		</table>
		
		
<!-- 		
		<p>아임 서포트 결제 모듈 테스트 해보기</p>
<button id="check_module" type="button">아임 서포트 결제 모듈 테스트 해보기</button> -->



 
<br><br><br><br><br>
		
		<table class="apply">
		<tr>
	<form action="" method="get" name="form1" id="form1" accept-charset='UTF-8' >
	<th>학년도</th> <th>학기</th> <th>학년</th><th>등록금액</th> <th>장학금액</th> <th>결제</th>  
		</tr>
		
		<tr><td>2018</td><td>2</td><td>3</td><td>1000</td><td>0</td>
		<td><!-- <input type="submit" value="결제" onclick='pagemove(2)'> -->
		<input type="submit" id="tuipay" value="결제">
<!-- <button id="check_module" type="button">결제</button>	 -->	
		</td>

    <c:forEach var="Kyeol" items="${Kyeol1}">
		<tr>
		<td><select name="year_check">
    <option value="">학년도</option>
    <option value="year">2018년도</option>
    <option value="year">2019년도</option>
    <option value="year">2020년도</option>
    <option value="year">2021년도</option>
	</select></td> 
	
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
	<td>${Kyeol.TUI_FEE}</td> <td>${Kyeol.SCH_PRICE}</td> 
	<td><!-- <input type="submit" name="ok" value="결제" onclick=''> -->
	
	
	</td> 
		</tr>
   <input type="hidden" id="tui" name='tui' value=100>
   <input type="hidden" id="id" name='id' value="Kyeol">
	</form>
</c:forEach>
		</table>

</body>
</html>