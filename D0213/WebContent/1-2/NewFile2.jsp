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
out.print("NewFile2.jsp");


%><br>
<%String v=request.getParameter("test");
out.print(v); %>

</body>
</html>