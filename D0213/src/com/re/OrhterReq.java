package com.re;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrhterReq
 */
@WebServlet("/OrhterReq")
public class OrhterReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrhterReq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path=request.getContextPath();
		String localaddr=request.getLocalAddr();
		String contype=request.getContentType();
		String pathinfo=request.getPathInfo();
		String servername=request.getServerName();
		String uri=request.getRequestURI();
		StringBuffer url=request.getRequestURL();
		int port1=request.getLocalPort();
		int port2=request.getServerPort();
		int port3=request.getRemotePort();
		
		PrintWriter out=response.getWriter();
		out.println("path :"+path);
		out.println("local :"+localaddr);
		out.println("remoteaddr :"+contype);
		out.println(pathinfo);
		out.println(servername);
		out.println(uri);
		out.println(url);
		out.println(port1);
		out.println(port2);
		out.println(port3);
		String host=request.getRemoteHost();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
