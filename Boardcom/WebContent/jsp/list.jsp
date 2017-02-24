<%@page import="com.kic.DAO.BoardDAO"%>
<%@page import="com.kic.VO.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
   int currpage=(Integer)request.getAttribute("currpage");
   int totalpage=(Integer)request.getAttribute("totalpage");
   List<BoardVO> list=(List<BoardVO>) request.getAttribute("list");
   int start=(Integer) request.getAttribute("startblock");
   int end=(Integer)request.getAttribute("endblock");
   
%>

 <a href="add.do">추가</a>
 <table>
  <thead>
   <tr>
    <th>번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>작성일자</th>
    <th>조회수</th>
   </tr>
  </thead>
  <tbody>
   <%
      for(int i=0; i<list.size(); i++)
      {
    	  BoardVO data=list.get(i);
    	%>
   <tr>
    <td><%=data.getNum()%></td>
    <td><a
     href="detail.do?num=<%=data.getNum()%>&currpage=<%=currpage%>"><%=data.getTitle()%></a></td>
    <td><%=data.getWriter()%></td>
    <td><%=data.getWritedate()%></td>
    <td><%=data.getReadno()%></td>
   </tr>
   <% 
      }
  
  
  %>
  </tbody>
 </table>
 <%
     if(start>1)
     {	   
  %>
 <a href="list.do?currpage=<%=start-1%>">이전</a>
 <% } %>
 <%
     for(int i=start; i<=end; i++)
     {
      if(i==currpage)
      {
    %>
 <%=i%>
 <%} else { %>
 <a href="list.do?currpage=<%=i%>"><%=i%></a>
 <% } 
     }
   %>

 <%  if(end<totalpage) 
      {%>
 <a href="list.do?currpage=<%=end+1%>">다음</a>
 <%} %>
 <div>
  <form method="post" action="list.do">
   <select name="search">
    <option value="num">번호</option>
    <option value="title">제목</option>
    <option value="content">내용</option>
    <option value="writer">작성자</option>
   </select> <input type="text" name="searchtext"> <input type="submit"
    value="검색">
  </form>
 </div>
 <% 
     String search = request.getParameter("search");
     String searchtext = request.getParameter("searchtext");
     if(search==null)
      search="";
     if(searchtext==null)
      searchtext="";
     BoardDAO dao = BoardDAO.getDAO();
   
     %>
</body>
</html>