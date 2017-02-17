<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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
ArrayList <String>arr= new ArrayList<String>();
arr.add("hong");
arr.add("kim");
arr.add("park");
Iterator<String> ita=arr.iterator();
while(ita.hasNext())
	out.print(ita.next()+"<br>");
%>



</body>
</html>