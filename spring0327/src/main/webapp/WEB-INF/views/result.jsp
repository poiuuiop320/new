<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${memberDTO.id }<br>
${memberDTO.password }<br>
${memberDTO.name }<br>
${memberDTO.email }<br>
${memberDTO.say }<br>

<c:forEach var="item" items="${memberDTO.gen }">
 <c:out value="${item }"></c:out><br>
</c:forEach>

<c:forEach var="item" items="${memberDTO.fav }">
 <c:out value="${item }"></c:out><br>
</c:forEach>
<c:forEach var="item" items="${memberDTO.food }">
 <c:out value="${item }"></c:out><br>
</c:forEach>


</body>
</html>