package com.kic.BoardController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.BoardDAO.BoardDAO;
import com.kic.BoardVO.BoardVO;
import com.kic.Controller.ActionForward;

public class DetailAction implements Action
{

 @Override
 public ActionForward execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  // TODO Auto-generated method stub
  int num=Integer.parseInt(request.getParameter("num"));
  String cp=request.getParameter("currpage");
  int currpage=0;
  if(cp!=null)
   currpage=Integer.parseInt(cp);
  BoardDAO dao=BoardDAO.getDAO();
  dao.readCountUpdate(num);
  BoardVO data=dao.readData(num);
  request.setAttribute("data", data);
  request.setAttribute("currpage", currpage);
  
  ActionForward forward =new ActionForward();
  forward.setRedirect(false);
  forward.setPath("jsp/detail.jsp");
  return forward;
 }

}
