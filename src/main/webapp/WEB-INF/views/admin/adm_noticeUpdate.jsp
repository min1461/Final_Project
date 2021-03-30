<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./resources/css/n_contents.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<div class="container">
		<div class="row">
			<form action="" method="post">
				<table class="table table-striped"
					style="text-align: center; border: 1px solid #dddddd; width: 100%;">
					<thead>
						<tr>
							<th colspan="2"
								style="background-color: #eeeeee; text-align: center;">공지사항
								수정</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td style="width: 20%; border: 1px solid #dddddd;">제목</td>
							<td colspan="2" style="border: 1px solid #dddddd;"><input
								type="text" class="textupdate" value="<%--${}--%>"></td>
						</tr>
						<tr>
							<td style="border: 1px solid #dddddd;">내용</td>
							<td colspan="2"
								style="height: 400px; border: 1px solid #dddddd; text-align: left;"><textarea
									class="textupdate" value="<%--${}--%>"></textarea></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" value="수정완료">
			</form>
		</div>
	</div>

</body>
</html>