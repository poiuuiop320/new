package com.kic.BoardController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.BoardDAO.BoardDAO;
import com.kic.BoardVO.BoardVO;
import com.kic.Controller.ActionForward;

public class ListAction implements Action
{

 @Override
 public ActionForward execute(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
 {
  String a=request.getParameter("currpage");
  int currpage=1;
  if(a!=null)
   currpage=Integer.parseInt(a);
  //페이지수를 계산해야한다

  int pagesize=5;
  //카운트정보를 이용해 페이지수를 계산한다. BoardDAO에서
  BoardDAO dao=BoardDAO.getDAO();

  int datacount=dao.getCount();
  int totalpage=datacount/pagesize+(datacount%pagesize==0?0:1);


  int startrow=(currpage-1)*pagesize+1;//페이지첫번째자료
  int endrow=startrow+pagesize-1;//페이지 마지막자료

  if(endrow>datacount)
  {
   endrow=datacount;
  }
  int blocksize=5;//total page 1..5 6..8
  int startblock=((currpage-1)/blocksize)*blocksize+1;
  int endblock=startblock+blocksize-1;
  
  if(totalpage<endblock)
   endblock=totalpage;
  
  List<BoardVO> list=dao.getData(startrow,endrow);
  
  
  request.setAttribute("list", list);
  request.setAttribute("totalpage", totalpage);
  request.setAttribute("currpage", currpage);
  request.setAttribute("startblock", startblock);
  request.setAttribute("endblock", endblock);
  
  ActionForward forward=new ActionForward();
  forward.setRedirect(false);//false forward방식으로 넘겨야함.
  forward.setPath("jsp/list.jsp");
  
  return forward;
 }

}
