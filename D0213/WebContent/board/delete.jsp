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
int num=Integer.parseInt(request.getParameter("id"));
BoardDAO dao=new BoardDAO();
dao.delData(num);
response.sendRedirect("list.jsp");
%>
</body>
</html>