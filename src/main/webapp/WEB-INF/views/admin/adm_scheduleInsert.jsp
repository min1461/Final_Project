<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주요일정 입력</title>
<link href="./resources/css/n_contents.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<form action="adm_scheduleInsertForm" method="post">
				<table class="table table-striped"
					style="text-align: center; border: 1px solid #dddddd; width: 100%;">
					<thead>
						<tr>
							<th colspan="2"
								style="background-color: #eeeeee; text-align: center;">학교 주요일정 쓰기</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td style="width: 20%; border: 1px solid #dddddd;">제목</td>
							<td colspan="2" style="border: 1px solid #dddddd;"><input
								type="text" class="textinsert" name="SCD_TITLE"></td>
						</tr>
 						<tr>
							<td style="border: 1px solid #dddddd;">작성자</td>
							<td colspan="2" style="border: 1px solid #dddddd;">${ADM_NAME}
								<input type="hidden" name="ADM_NUM" value="${ADM_NUM}"></td>
						</tr>
						<tr>
							<td style="border: 1px solid #dddddd;">내용</td>
							<td colspan="2"
								style="height: 400px; border: 1px solid #dddddd; text-align: left;"><input
								type="text" class="textinsert" name="SCD_CONT"></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" value="글쓰기 완료">
			</form>
		</div>
	</div>
</body>
</html>