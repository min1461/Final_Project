<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%request.setCharacterEncoding("euc-kr");
response.setContentType("text/html; charset=euc-kr");%> 
    
    <%
     String buyer_name = (String)request.getParameter("buyer_name");    
     int totalPrice = 100;
     String tui = request.getParameter("tui");
           
     System.out.println("이름: "+buyer_name);
     System.out.println("총 결제금액: "+ totalPrice);
 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록금결제</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"
		charset='EUC-KR'></script>
<script>



IMP.init('imp66159679');

IMP.request_pay({
    pg : 'inicis', // version 1.1.0부터 지원.
    pay_method : 'card',
    merchant_uid : 'merchant_' + new Date().getTime(),
    amount : <%=totalPrice%> , 
    buyer_name : '<%=buyer_name%>',
    buyer_postcode : '123-456'
}, function(rsp) {
    if ( rsp.success ) {
        var msg = '결제가 완료되었습니다.';
        msg += '고유ID : ' + rsp.imp_uid;
        msg += '상점 거래ID : ' + rsp.merchant_uid;
        msg += '결제 금액 : ' + rsp.paid_amount;
        msg += '카드 승인번호 : ' + rsp.apply_num;
        
       
    
       	$.ajax({
       		type:"get",
       		url: "orderInsert.java", // 이렇게 호출하는대가 있는진 모르겠지만 말도 안되는 경로고 ㅋ
        	url: "http://localhost:8081/3_semiProject/orderInsert", // 실제로 호출하는 URL을 적어줘야되 도메인까지 아 저는 여태 배웟을때 파일을 호출하고 form에서도 서블릿을 호출하려면
       
        	data:{
        		Price:"<%=tui%>"     	
        	},
        	
        	success: function(){
        		alert("성공");
        	} ,
        		
        	error: function(){
        		alert("실패");
       	}
        }) //ajax-end
               
        
        window.onload = function(){
            setTimeout("startPage()", 5000);
        }  
        function startPage(){
            document.location.href="stu_tuitionCheck";
        }

        
    } else {
        var msg = '결제에 실패하였습니다.';
        msg += '에러내용 : ' + rsp.error_msg;
    }
    alert(msg);
});
</script>
</head>
<body>

<div style="text-align:center;">
 <p>결제가 완료후 Main Page로 이동합니다.</p>  
</div>

<form action="stu_tuitionCheck">
<center><input type="submit" value="처음으로"></center>
</form>


</body>
</html>