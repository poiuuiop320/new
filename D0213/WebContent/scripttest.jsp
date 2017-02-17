<%@page import="java.io.PrintWriter"%>
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
   
  out.print(su);
  
  
  out.print(name);
 prt("nnnnn");
%>
<%!
int su=10;
%>
<%!
String name="hong gil dong";
%>

<%!
 public void prt(String name)
{
	System.out.println(name);
}
%>

</body>
</html>