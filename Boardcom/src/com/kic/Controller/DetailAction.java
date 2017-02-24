package com.kic.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.DAO.BoardDAO;
import com.kic.VO.BoardVO;

public class DetailAction implements Action
{

 @Override
 public String execute(HttpServletRequest request,HttpServletResponse response)
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
  return "jsp/detail.jsp";
 }

}
