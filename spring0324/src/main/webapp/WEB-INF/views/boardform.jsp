<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="boardresult" method="post">
<label  for="num">번호</label>
<input type="text" name="num"><br>

<label  for="title">제목</label>
<input type="text" name="title"><br>

<label  for="content">내용</label>
<textarea rows="10" cols="10" name="content"></textarea>

<label  for="writer">작성자</label>
<input type="text" name="writer"><br>

<label  for="email">email</label>
<input type="text" name="email"><br>

<input type="submit" value="전송">
</form>
</body>
</html>