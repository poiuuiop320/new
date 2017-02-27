<%@page import="com.kic.BoardVO.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
/* function dele(id)
{
	location.href="delete.do?id="+id;
	} */
/* function modi(id)
{
	location.href="modify.do?id="+id;
	} */


</script>
</head>
<body>
  <%
   BoardVO data=(BoardVO) request.getAttribute("data");
   int currpage=(Integer) request.getAttribute("currpage");
  %>
  
    <ul>
     <li><%=data.getNum() %></li>
     <li><%=data.getTitle() %></li>
    <li><%=data.getContent() %></li>
    <li><%=data.getWriter() %></li>
    <li><%=data.getWritedate()%></li>
    <li> <%=data.getReadno() %></li>
    </ul>
    <%-- <button onclick="modi(<%=data.getNum() %>)">수정</button> --%>
   <%--  <button onclick="dele(<%=data.getNum() %>)">삭제</button>--%>
  <a href="list.do?currpage=<%=currpage%>">목록보기</a>
  <a href="delete.do?id=<%=data.getNum() %>">삭제</a>
  <a href="modify.do?id=<%=data.getNum() %>">수정</a>
</body>
</html>