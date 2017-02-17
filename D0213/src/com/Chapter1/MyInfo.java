package com.Chapter1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyInfo
 */
@WebServlet("/myinfo.do")
public class MyInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String a=request.getParameter("id");
		Enumeration <String> enu=request.getParameterNames();
		while(enu.hasMoreElements())
			out.println(enu.nextElement()+"<br>");*/
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		String id=request.getParameter("id");
		
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		
		out.print(id);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hh");
		
	}

}
