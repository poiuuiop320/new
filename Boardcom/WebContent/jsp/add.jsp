<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="addresult.do">
  <ul>
    <li><label for="title">제목</label><input type="text" name="title" id="title"></li>  
    <li><label for="content">내용</label></li>
    <li>
       <textarea rows="5" cols="50" name="content" id="content"></textarea>
    </li>
    <li><label for="writer">작성자</label><input type="text" name="writer" id="writer"></li>
    <li>
       <input type="submit" value="전송"> <input type="reset" value="취소">
    </li>
  </ul>
</form>


</body>
</html>