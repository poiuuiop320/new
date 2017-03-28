<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : ${memberVO.name }
나이 : ${memberVO.age }
주소 : ${memberVO.addr }
<c:forEach var="i" items="${memberVO.food }">
 <c:out value="${i }"></c:out>
</c:forEach> 
</body>
</html>