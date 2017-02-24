package com.kic.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.DAO.BoardDAO;
import com.kic.VO.BoardVO;

public class AddResultAction implements Action
{

 @Override
 public String execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  request.setCharacterEncoding("utf-8");
  String title=request.getParameter("title");
  String content=request.getParameter("content");
  String writer=request.getParameter("writer");
  BoardVO data=new BoardVO();
  data.setTitle(title);
  data.setContent(content);
  data.setWriter(writer);
  BoardDAO dao=BoardDAO.getDAO();
  //dao.addData(data);
  int result=dao.addData(data);
  request.setAttribute("result", result);
  return "jsp/addresult.jsp";
 }

}
