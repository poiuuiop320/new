<%@page import="BoardDTO.BoardDTO"%>
<%@page import="BoardDAO.BoardDAO"%>
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
int id=Integer.parseInt(request.getParameter("id"));

String title=request.getParameter("title");

String content=request.getParameter("content");

String writer=request.getParameter("writer");

BoardDAO dao=new BoardDAO();

BoardDTO dto=new BoardDTO();
//BoardDTO dta=dao.readData(id);
dto.setNum(id);
dto.setTitle(title);
dto.setContent(content);
dto.setWriter(writer);
dao.moditydata(dto);
response.sendRedirect("list.jsp");

%>

</body>
</html>