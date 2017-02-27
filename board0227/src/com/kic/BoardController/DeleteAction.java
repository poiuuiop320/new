package com.kic.BoardController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.BoardDAO.BoardDAO;
import com.kic.Controller.ActionForward;

public class DeleteAction implements Action
{

 @Override
 public ActionForward execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  int id=Integer.parseInt(request.getParameter("id"));
  BoardDAO dao=BoardDAO.getDAO();
  dao.deleteData(id);
  ActionForward forward = new ActionForward();
  forward.setRedirect(true);
  forward.setPath("list.do");
  return forward;
  
 }

}
