<%@page import="BoardDTO.BoardDTO"%>
<%@page import="BoardDAO.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/content.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="../js/detail.js"></script>
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		BoardDAO dao = new BoardDAO();
		BoardDTO data = dao.readData(id);
	%>

	<div>
		<ul>
			<li><%=data.getWriter()%></li>
			<li><label for="num" >번호</label>
				<div id="num"><%=data.getNum()%></div></li>
			<li><label for="title">제목</label>
				<div><%=data.getTitle()%></div></li>
			<li><label for="content">내용</label>
				<div><%=data.getContent()%></div> </li>
			<li><button id="modify">수정</button>
				<button id="delete">삭제</button></li>

		</ul>
	</div>

</body>
</html>