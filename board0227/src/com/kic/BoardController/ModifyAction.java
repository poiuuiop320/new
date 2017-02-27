package com.kic.BoardController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.BoardDAO.BoardDAO;
import com.kic.BoardVO.BoardVO;
import com.kic.Controller.ActionForward;

public class ModifyAction implements Action
{

 @Override
 public ActionForward execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  int id=Integer.parseInt(request.getParameter("id"));
  BoardDAO dao=BoardDAO.getDAO();
  BoardVO data=dao.readData(id);
  request.setAttribute("data", data);
  ActionForward forward=new ActionForward();
  forward.setRedirect(false);
  forward.setPath("jsp/modify.jsp");
  return forward;
 }

}
