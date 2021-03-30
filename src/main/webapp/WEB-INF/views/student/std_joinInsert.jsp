<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="./resources/css/std_joinInsert.css">
<body>
<h1 class="join"> |입사 신청</h1>
 <table class="std_joininsert">
         
        <tr>
          <th scope="row">학과</th>
          <td><input type="text" name="department" id="department">
	</td>
	<th scope="row">주소</th>
          <td><input type="text" id="sample6_postcode" placeholder="우편번호">
          <input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
          <input type="text" id="sample6_address" placeholder="주소"><br>
    	  <input type="text" id="sample6_detailAddress" placeholder="상세주소">
    	  <input type="text" id="sample6_extraAddress" placeholder="참고항목">
	</td>
	
        </tr>
        <tr>
          <th scope="row">학번</th>
          <td><input type="text" name="hakbun" id="hakbun"></td>
          <th scope="row">이름</th>
          <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
          <th scope="row">성별</th>
          <td><select name="gender">
    <option value="">성별선택</option>
    <option value="man">남자</option>
    <option value="woman">여자</option>
   
    
	</select></td>
          <th scope="row">전화번호</th>
          <td><input type="text" name="tel" id="tel"></td>
        </tr>
        
        <tr>
          <th scope="row">보호자 이름</th>
          <td><input type="text" name="parent_name" id="parent_name"></td>
          <th scope="row">보호자 관계</th>
          <td><input type="text" name="parent_rel" id="parent_rel"></td>
        </tr>
        <tr>
         <th scope="row">보호자 전화번호</th>
          <td><input type="text" name="parent_tel" id="parent_tel"></td>
          <th scope="row">희망인실</th>
          <td><select name="room_num">
    <option value="">인실선택</option>
    <option value="2room">2인실</option>
    <option value="3room">3인실</option>
    <option value="4room">4인실</option>
    
	</select></td>
     
    </table>
    <input type="submit" id="req" value="신청" />
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
</script>
</body>
</html>