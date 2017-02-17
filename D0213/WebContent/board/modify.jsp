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
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		BoardDAO dao = new BoardDAO();
		BoardDTO data = dao.readData(id);
	%>


	<form method="post" action="modifydata.jsp">
		<ul>
			<li><label for="id">번호</label><input type="text"  name="id" id="id" value="<%=data.getNum()%>" readonly="readonly"></li>
			<li><label for="title">제목</label><%=data.getTitle()%></li>
			<li><label for="content">내용</labe></li>
			<li>
    <textarea rows="10" cols="50" id="content" name="content"><%=data.getContent()%></textarea>
    </li>
			
		</ul>
		<div><input type="submit" value="변경"><input type="reset" value="취소"></div>


	</form>
</body>
</html>