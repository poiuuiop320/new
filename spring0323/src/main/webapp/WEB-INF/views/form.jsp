<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="result" method="post">
<label>이름</label><input type="text" name="name"><br>
<label>나이</label><input type="text" name="age"><br>
<label>주소</label><input type="text" name="addr"><br>
<label>전화번호</label><input type="text" name="tel"><br>
<label>성별</label><br>
<label>남</label>
<input type="radio" name="gen" value="남">
<label>여</label>
<input type="radio" name="gen" value="여"><br>
<label>취미</label>
<label>운동</label><input type="checkbox" name="fav" value="운동">
<label>독서</label><input type="checkbox" name="fav" value="독서">
<label>여행</label><input type="checkbox" name="fav" value="여행">
<label>공부</label><input type="checkbox" name="fav" value="공부"><br>
<label>하고싶은 말</label><br>
<textarea cols="10" rows="10" name="say"></textarea><br>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
</body>
</html>