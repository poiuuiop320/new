package com.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test.do")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */   
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		String gen=req.getParameter("gen");
		String[] food=req.getParameterValues("food");
		String[] fav=req.getParameterValues("fav");
		String addr=req.getParameter("loc");
		String dept=req.getParameter("dept");
		String talk=req.getParameter("talk");
		PrintWriter out= resp.getWriter();

		out.print(id+"<br>");
		out.print(pwd+"<br>");
		out.print(gen+"<br>");
		out.print(food);
		String r="";
		for(String in:food)
		{
			r+=in+" ";
		}
		out.print(r);
		
		String result="";
		for(String index:fav)
		{
		 result+=index+" ";
		 
		}
		out.print(result+"<br>");
		out.print(addr+"<br>");
		out.print(dept+"<br>");
		out.print(talk+"<br>");
	}


}
