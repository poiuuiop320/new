package com.kic.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontAction
 */
@WebServlet("*.do")
public class FrontAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 req(request,response);
	}

 private void req(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
 {
  String urlpath=request.getServletPath();
  Action act=null;
  if(urlpath.equals("/list.do"))
   act=new ListAction();
  else if(urlpath.equals("/detail.do"))
   act=new DetailAction();
  else if(urlpath.equals("/add.do"))
   act=new AddAction();
  else if(urlpath.equals("/addresult.do"))
   act=new AddResultAction();
  else if(urlpath.equals("/modify.do"))
   act=new ModifyAction();
  else if(urlpath.equals("/modifyok.do"))
   act=new ModifyokAction();
  else if(urlpath.equals("/delete.do"))
   act=new DeleteAction();
  
  
  String path=act.execute(request, response);
  RequestDispatcher disp = request.getRequestDispatcher(path);
  disp.forward(request, response);
  
 }

}
