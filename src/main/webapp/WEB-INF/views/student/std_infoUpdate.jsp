<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KG대학교-개인정보페이지</title>
<link href="resources/css/std_infoUpdate.css" rel="stylesheet">
</head>
<body>
	
	<h2>|마이 페이지</h2>
	<br>
	<form action="">
		<table>
			<tr>
				<td id="profile" rowspan="5"><c:out value="${std_VO.STU_PHOTO}" /></td>
				<td id="infomenu">학번</td>
				<td id="infovalue"><c:out value="${std_VO.STU_NUM}" /></td>
				<td id="infomenu">성명(한글)</td>
				<td id="infovalue"><c:out value="${std_VO.STU_NAME}" /></td>
				<td id="infomenu">성명(영문)</td>
				<td id="infovalue"><c:out value="${std_VO.STU_NAME_ENG}" /></td>
				<td id="infomenu">소속대학</td>
				<td id="infovalue"><c:out value="${std_VO.STU_UNI}" /></td>
			</tr>
			<tr>
				<td id="infomenu">전공</td>
				<td id="infovalue"><c:out value="${std_VO.STU_MAJOR}" /></td>
				<td id="infomenu">생년월일</td>
				<td id="infovalue"><c:out value="${std_VO.STU_BIRTH}" /></td>
				<td id="infomenu">국적</td>
				<td id="infovalue"><c:out value="${std_VO.STU_NAT}" /></td>
				<td id="infomenu">신청학점/<br />이수학점

				</td>
				<td id="infovalue"><c:out value="${std_VO.STU_APPCRE}" />/<c:out value="${std_VO.STU_GRACRE}" /></td>
			</tr>
			<tr>
				<td id="infomenu">주소</td>
				<td id="infovalue" colspan="3"><input
					type="text"
					style="border: none; border-right: 0px; border-top: 0px; boder-left: 0px; boder-bottom: 0px; width: 500px; height: 30px; text-align: center"
					value="<c:out value="${std_VO.STU_ADDRESS}" />" required /></td>
				<td id="infomenu">전화번호</td>
				<td id="infovalue"><input type="text"
					style="border: none; border-right: 0px; border-top: 0px; boder-left: 0px; boder-bottom: 0px; width: 200px; height: 30px; text-align: center"
					value="<c:out value="${std_VO.STU_PHONENUM}" />" required /></td>
				<td id="infomenu">이메일</td>
				<td id="infovalue"><input type="text"
					style="border: none; border-right: 0px; border-top: 0px; boder-left: 0px; boder-bottom: 0px; width: 200px; height: 30px; text-align: center"
					value="<c:out value="${std_VO.STU_EMAIL}" />" required /></td>
			</tr>
			<tr>
				<td id="infomenu">계좌번호</td>
				<td id="infovalue" colspan="3"><input type="text"
					style="border: none; border-right: 0px; border-top: 0px; boder-left: 0px; boder-bottom: 0px; width: 200px; height: 30px; text-align: center"
					value="<c:out value="${std_VO.STU_BANKACC}" />" required /><input type="text"
					style="border: none; border-right: 0px; border-top: 0px; boder-left: 0px; boder-bottom: 0px; width: 300px; height: 30px; text-align: center"
					value="<c:out value="${std_VO.STU_BANKACC}" />" required /></td>
				<td id="infomenu">총평점</td>
				<td id="infovalue"><c:out value="${std_VO.STU_TOTALGPA}" /></td>
				<td id="infomenu">총평점평균</td>
				<td id="infovalue"><c:out value="${std_VO.STU_TOTALAVE}" /></td>
			</tr>
			<tr>
				<td id="infomenu">입학일</td>
				<td id="infovalue"><c:out value="${std_VO.STU_ADMDAY}" /></td>
				<td id="infomenu">상태</td>
				<td id="infovalue"><c:out value="${std_VO.STU_STATE}" /></td>
				<td id="infomenu">현재비밀번호</td>
				<td id="infovalue"><input type="text"
					style="border: none; border-right: 0px; border-top: 0px; boder-left: 0px; boder-bottom: 0px; width: 200px; height: 30px; text-align: center"
					placeholder="정보변경시 비밀번호를 입력" required /></td>
				<td id="infomenu">변경비밀번호</td>
				<td id="infovalue"><input type="text"
					style="border: none; border-right: 0px; border-top: 0px; boder-left: 0px; boder-bottom: 0px; width: 200px; height: 30px; text-align: center"
					placeholder="변경하실 비밀번호를 입력" /></td>
			</tr>
			<tr>
				<td id="profiletext">프로필 사진<br /> <input type="button"
					id="btn_profile" value="변경" onclick="" /></td>
				<td colspan="3" id="guide" style="text-align: center;">※고유정보변경은
					학사사무실로 문의주세요.</td>
				<td colspan="4" id="guide" style="text-align: center;">※프로필사진,
					계좌번호, 전화번호, 이메일, 주소, 비밀번호변경이 가능합니다.</td>
				<td align="right"><div>
						<input type="submit" value="정보변경"
							style="width: 100%; height: 30px;" />
					</div></td>
			</tr>
		</table>
	</form>
</body>
</html>