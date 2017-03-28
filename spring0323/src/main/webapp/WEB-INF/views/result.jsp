<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	    이름 : ${name }
	<br>나이 : ${age }
	<br>주소 : ${addr }
	<br>번호 : ${tel }
	<br>성별 : ${gen }
	<br>취미 :
	<c:forEach var="i" items="${fav }">
		<c:out value="${i }"></c:out>
	</c:forEach>
	<br>말 : ${say }
	<br> --%>
		    이름 : ${mem.name }
	<br>나이 : ${mem.age }
	<br>주소 : ${mem.addr }
	<br>번호 : ${mem.tel }
	<br>성별 : ${mem.gen }
	<br>취미 :
	<c:forEach var="i" items="${mem.fav }">
		<c:out value="${i }"></c:out>
	</c:forEach>
	<br>말 : ${mem.say }
	<br>
</body>
</html>