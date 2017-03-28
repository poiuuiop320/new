<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:form commandName="memberDTO" action="result" method="post">
<f:label path="id">아이디</f:label>
<f:input path="id"/>
<f:errors path="id"/>
<br>

<f:label path="password">비밀번호</f:label>
<f:password path="password"/>
<f:errors path="password"/>
<br>
<f:label path="name">이름</f:label>
<f:input path="name"/>
<f:errors path="name"/>
<br>
<f:label path="email">이메일</f:label>
<f:input path="email"/>
<f:errors path="email"/>
<br>
<f:label path="say">기타</f:label>
<f:textarea path="say" cols="10" rows="10"/>
<f:errors path="say"/>
<br>

<f:label path="fav">좋아하는거</f:label>
   <f:select path="fav">
    <f:options items="${fav}"/>
   </f:select>
   <br>
   <f:label path="gen">성별</f:label>
   <f:radiobuttons items="${gen}" path="gen"/><br>
   <f:label path="food"></f:label>
   <f:checkboxes items="${food }" itemLabel="fcode" itemValue="fname" path="food"/>
<input type="submit" value="전송"> 

</f:form>
</body>
</html>