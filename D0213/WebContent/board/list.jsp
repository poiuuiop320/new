<%@page import="BoardDTO.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="BoardDAO.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../css/main.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="http://localhost:8080/D0216/js/main.js"></script>
</head>
<body>

	<%
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.boardView();
	%>

	<table>

		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<!-- <th>내용</th> -->
				<th>작성자</th>
		</thead>
		<tbody>




			<%
				for (int i = 0; i < list.size(); i++) {
					BoardDTO data = list.get(i);
			%>

			<tr>
				<td><%=data.getNum()%></td>
				<td><a href="content.jsp?id=<%=data.getNum()%>"><%=data.getTitle()%></a></td>
				<!--<td><%=data.getContent()%></td>-->
				<td><%=data.getWriter()%></td>
			</tr>
			<%
				}
			%>

		</tbody>
		<tfoot></tfoot>

	</table>
	<a href="add.jsp"><input type="image" src="../img/btn_write.gif"></a>

</body>
</html>