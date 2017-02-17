<%@page import="BoardDAO.BoardDAO"%>
<%@page import="BoardDTO.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
request.setCharacterEncoding("utf-8");
String title=request.getParameter("title");
String writer=request.getParameter("writer");
String content=request.getParameter("content");
BoardDTO data=new BoardDTO();
data.setTitle(title);
data.setWriter(writer);
data.setContent(content);

BoardDAO dao=new BoardDAO();
int r=dao.boardappend(data);
if(r>0)
{
	response.sendRedirect("list.jsp");
}
else
{
	response.sendRedirect("add.jsp");
}
%>


</body>
</html>