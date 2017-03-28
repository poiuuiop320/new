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
<%-- ${count}
${dname}
${dto.dname }
${dto.loc }
${dto.deptno } --%>
부서코드  ${dto.deptno}<br>
부서명 ${dto.dname }<br>
부서위치 ${dto.loc }<br>  
<c:forEach var="index" items="${list }">
 <c:out value="${index.deptno }"></c:out>
 <c:out value="${index.dname }"></c:out>
 <c:out value="${index.loc }"></c:out><br>
</c:forEach>

</body>
</html>