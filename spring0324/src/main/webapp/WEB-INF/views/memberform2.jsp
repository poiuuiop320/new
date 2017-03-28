<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:form commandName="memberDTO" action="myresult" method="post">
     <f:label path="name">이름</f:label><f:input path="name"/>
     <f:errors path="name"></f:errors><br>
     <f:label path="addr">주소</f:label><f:input path="addr"/>
     <f:errors path="addr"></f:errors><br>
     <f:label path="phone">번호</f:label><f:input path="phone"/>
     <f:errors path="phone"></f:errors><br>
     <f:label path="age" >나이</f:label><f:input path="age"/>
     <f:errors path="age"></f:errors><br>
     <input type="submit" value="전송">
</f:form>
</body>
</html>