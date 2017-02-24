package com.kic.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.DAO.BoardDAO;
import com.kic.VO.BoardVO;

public class ModifyAction implements Action
{

 @Override
 public String execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  int id=Integer.parseInt(request.getParameter("id"));
  BoardDAO dao=BoardDAO.getDAO();
  BoardVO data=dao.readData(id);
  request.setAttribute("data", data);
  
  return "jsp/modify.jsp";
 }

}
