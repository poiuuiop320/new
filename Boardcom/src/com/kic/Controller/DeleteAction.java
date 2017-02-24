package com.kic.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.DAO.BoardDAO;

public class DeleteAction implements Action
{

 @Override
 public String execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  int id=Integer.parseInt(request.getParameter("id"));
  BoardDAO dao=BoardDAO.getDAO();
  dao.deleteData(id);
  return"/list.do";
  
 }

}
