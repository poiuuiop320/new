package com.kic.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.DAO.BoardDAO;
import com.kic.VO.BoardVO;

public class ModifyokAction implements Action
{

 @Override
 public String execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  request.setCharacterEncoding("utf-8");
  int num=Integer.parseInt(request.getParameter("num"));
  String title=request.getParameter("title");
  String content=request.getParameter("content");
  String writer=request.getParameter("writer");
  BoardVO data=new BoardVO();
  data.setNum(num);
  data.setTitle(title);
  data.setContent(content);
  data.setWriter(writer);
  BoardDAO dao=BoardDAO.getDAO();
  dao.modifyData(data);
  
  return "jsp/modifyok.jsp";
 }

}
