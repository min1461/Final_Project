<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./resources/css/scholarship.css" rel="stylesheet">
<title>수강신청</title>
</head>
<body>

	<h2 class="title1">|수강신청</h2>
	<div class="register_section">
		<h3>개설과목 목록</h3>
		<br>
		<table class="apply">
			<tr>
				<th id='select'>수강신청</th>
				<th id='sub_num'>교과목코드</th>
				<th id='prof_name'>교수번호</th>
				<th id='sub_name'>과목명</th>
				<th id='sub_time'>강의시간(교시)</th>
				<th id='sub_room'>강의실</th>
				<th id='sub_max'>최대정원</th>
				<th id='sub_min'>최소정원</th>
				<th id='sub_state'>이수구분</th>
				<th id='sub_hak'>학점</th>
			</tr>
			<c:forEach var="gae" items="${sub_VO}" varStatus="status">
				<tr>
					<td><button class='insertTR' id='${status.index}'
							onclick="insertTR('${status.index}')">신청</button></td>
					<td class='sub_num'>${gae.SUB_NUM}</td>
					<td class='prof_name'>${gae.PROF_NAME}</td>
					<td class='sub_name'>${gae.SUB_NAME}</td>
					<td class='sub_time'>${gae.SUB_TIME}</td>
					<td class='sub_room'>${gae.SUB_ROOM}</td>
					<td class='sub_max'>${gae.SUB_MAX}</td>
					<td class='sub_min'>${gae.SUB_MIN}</td>
					<td class='sub_state'>${gae.SUB_STATE}</td>
					<td class='sub_hak'>${gae.SUB_HAK}</td>
				</tr>
			</c:forEach>
		</table>
		<br>

		<h3>예비신청내역</h3>
		<br>
		<table class="apply" id="apply">
			<tr>
				<th id='select'>수강취소</th>
				<th id='sub_num'>교과목코드</th>
				<th id='prof_name'>교수번호</th>
				<th id='sub_name'>과목명</th>
				<th id='sub_time'>강의시간(교시)</th>
				<th id='sub_room'>강의실</th>
				<th id='sub_max'>최대정원</th>
				<th id='sub_min'>최소정원</th>
				<th id='sub_state'>이수구분</th>
				<th id='sub_hak'>학점</th>
			</tr>
		</table>
	</div>
</body>
<script>
	function insertTR(_num) {
		var html = '';
		var i = _num;

		var SUB_NUM = $('.sub_num').eq(i).text();
		var PROF_NAME = $('.prof_name').eq(i).text();
		var SUB_NAME = $('.sub_name').eq(i).text();
		var SUB_TIME = $('.sub_time').eq(i).text();
		var SUB_ROOM = $('.sub_room').eq(i).text();
		var SUB_MAX = $('.sub_max').eq(i).text();
		var SUB_MIN = $('.sub_min').eq(i).text();
		var SUB_STATE = $('.sub_state').eq(i).text();
		var SUB_HAK = $('.sub_hak').eq(i).text();

		html += '<tr>';
		html += '<td><button onclick="deleteTR(this,'+SUB_NUM+','+i+')"> 취소 </button></td>';
		html += '<td class="addsubnum">' + SUB_NUM + '</td>';
		html += '<td>' + PROF_NAME + '</td>';
		html += '<td>' + SUB_NAME + '</td>';
		html += '<td>' + SUB_TIME + '</td>';
		html += '<td>' + SUB_ROOM + '</td>';
		html += '<td>' + SUB_MAX + '</td>';
		html += '<td>' + SUB_MIN + '</td>';
		html += '<td>' + SUB_STATE + '</td>';
		html += '<td>' + SUB_HAK + '</td>';
		html += '</tr>';

		document.getElementById(i).disabled = true;
		$("#apply").append(html);
	}
	function deleteTR(obj,sub_num,status_num) {
		var tr = $(obj).parent().parent();
		tr.remove();
		document.getElementById(status_num).disabled = false;
	}
</script>
</html>