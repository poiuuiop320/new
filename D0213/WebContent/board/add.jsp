<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/add.css" rel="stylesheet">

</head>
<body>
	<form method="post" action="add_data.jsp">
		<ul>
			<li><label for="writer">작성자</label> <input type="text"
				name="writer" id="writer" required="required"></li>
			<li><label for="title">제목 </label> <input type="text"
				name="title" id="title" size="80" autofocus="autofocus"
				required="required"></li>

			<li><label for="content">내용 </label></li>
			<li><textarea rows="30" cols="100" id="content" name="content"></textarea></li>
			<li><input type="image" src="../img/btn_save.gif" alt="save"
				id="save"></li>
			<li><input type="image" src="../img/btn_cancle.gif" alt="cancle"
				id="cancle"></li>

		</ul>


	</form>
</body>
</html>