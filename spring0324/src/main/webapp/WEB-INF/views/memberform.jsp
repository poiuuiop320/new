<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


    <form method="post" action="myresult">
     <label for="name">이름</label><input type="text" name="name" id="name"><br>
     <label for="addr">주소</label><input type="text" name="addr" id="addr"><br>
     <label for="phone">번호</label><input type="text" name="phone" id="phone"><br>
     <label for="age">나이</label><input type="text" name="age" id="age"><br>
     <input type="submit" value="전송">
    </form>
    
</body>
</html>