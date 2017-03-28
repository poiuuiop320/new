<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="result" method="post">
<label>이름</label><input type="text" name="name"><br> 
<label>나이</label><input type="text" name="age"><br>
<label>주소</label><input type="text" name="addr.city">
<input type="text" name="addr.gu">
<input type="text" name="addr.street"><br>
<input type="submit" value="전송">
</form>
</body>
</html>