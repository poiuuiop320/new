<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setContentType("text/html;charset=utf-8");
request.setCharacterEncoding("utf-8");
String name=request.getParameter("name");
String addr=request.getParameter("addr");
int age=Integer.parseInt(request.getParameter("age"));
%>
이름<%=name %><br>
주소<%=addr %><br>
나이<%=age %>
</body>
</html>