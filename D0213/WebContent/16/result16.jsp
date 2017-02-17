<%@page import="com.kic.DTO.MemberDTO"%>
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
String name=request.getParameter("name");
String addr=request.getParameter("addr");
int age=Integer.parseInt(request.getParameter("age"));

MemberDTO dto1= new MemberDTO();
dto1.setName(name);
dto1.setAddr(addr);
dto1.setAge(age);
%>

이름<%=dto1.getName() %><br>
주소<%=dto1.getAddr() %><br>
나이<%=dto1.getAge() %>

<%-- <jsp:useBean id="dto" class="com.kic.DTO.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<jsp:getProperty property="name" name="dto"/>
<jsp:getProperty property="addr" name="dto"/>
<jsp:getProperty property="age" name="dto"/>
 --%>
 </body>
</html>