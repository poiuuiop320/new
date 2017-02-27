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
int result=(Integer)request.getAttribute("result");
if(result>0)
{
%>
<script>
alert('추가')
location.href="list.do";
</script>

<%
}
else 
{
 %>
 <script>
 location.href="add.do";
 </script>
 <%
 }
 %>
</body>
</html>