<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : ${data.name} <br>
나이 : ${data.age} <br>
주소 :${data.addr} <br>
분식메뉴 :  
<c:forEach var="i" items="${data.food}">
 <c:out value="${i}"/> <br>
</c:forEach> 
</body>
</html>