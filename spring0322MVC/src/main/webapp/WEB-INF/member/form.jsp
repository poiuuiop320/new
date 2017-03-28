<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="result">
 <label for="name">이름</label><input type="text" name="name" id="name"><br>
 <label for="age">나이</label><input type="text" name="age" id="age"><br>
 <label for="addr">주소</label><input type="text" name="addr" id="addr"><br>
 <label>분식</label>
 <label for="food1">떡볶이</label>
 <input type="checkbox" name="food" id="food1" value="떡볶이">
 <label for="food2">김밥</label>
 <input type="checkbox" name="food" id="food2" value="김밥">
 <label for="food3">순대</label>
 <input type="checkbox" name="food" id="food3" value="순대">
 
 <input type="submit" value="전송"> 
 </form>



</body>
</html>