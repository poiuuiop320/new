<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:form commandName="boardDTO" method="post" action="boardresult">
<f:label path="num">번호</f:label>
<f:input path="num"/>
<f:errors path="num"/> <br>

<f:label path="title">제목</f:label>
<f:input path="title"/>
<f:errors path="title"/> 

<br>
<f:label path="content">내용</f:label>
<f:textarea path="content" cols="10" rows="10"/>
<f:errors path="content"/><br>
<f:label path="writer">글쓴이</f:label>
<f:input path="writer"/>
<f:errors path="writer"/> <br>

<f:label path="email">이메일</f:label>
<f:input path="email"/>
<f:errors path="email"/> <br>

<input type="submit" value="전송">

</f:form>
</body>
</html>