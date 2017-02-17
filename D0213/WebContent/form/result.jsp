<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
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
response.setContentType("text/html; charset=utf-8");
request.setCharacterEncoding("utf-8");

String name=request.getParameter("name");
String idnumber=request.getParameter("idnumber");
String gn=idnumber.substring(6,7);
String gen="";
if(gn.equals("1")||gn.equals("3"))
	gen="남";
else
	gen="여";

GregorianCalendar gc=new GregorianCalendar();
int now = gc.get(Calendar.YEAR);
int age;
if(gn.equals("1")||gn.equals("2"))
	{
    age= now-Integer.parseInt("19"+idnumber.substring(0,2));
	}
else
{
	age=now-Integer.parseInt("20"+idnumber.substring(0,2));
}

%>

이름<%=name %><br>
주민번호<%=idnumber %><br>
성별<%=gen %><br>
나이<%=age %>
</body>
</html>