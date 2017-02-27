package com.kic.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kic.BoardController.Action;

/**
 * Servlet implementation class FrontAction
 */
@WebServlet(urlPatterns={"*.do"}
              ,initParams=
               {@WebInitParam(name="inital"
                            ,value="C:\\Users\\kitcoop\\Desktop\\jsp\\Boardcom\\WebContent\\WEB-INF\\prop.properties")
                } 

  )

public class FrontAction extends HttpServlet {
	@Override
 public void init(ServletConfig config) throws ServletException
 {
  // TODO Auto-generated method stub
  //super.init(config);
	 String inital= config.getInitParameter("inital");

	 Properties prop=new Properties();
	 FileReader fr=null;
	 try{
	  /*fr=new FileReader(inital);
	  prop.load(fr);*/
	  prop.load(new FileReader(inital));
	  Enumeration enu=prop.keys();
	  while(enu.hasMoreElements())
	  {
	   String key=(String)enu.nextElement();
	   
	   String value=(String)prop.get(key);
	   Class c =Class.forName(value);
	   //Object o=c.newInstance();
	   Action o=(Action)c.newInstance();
	   ht.put(key, o);
	  }
	  
	 }catch(FileNotFoundException e){System.out.println(e.getMessage());}
	 catch(IOException e){System.out.println(e.getMessage());} 
	 catch (ClassNotFoundException e) { System.out.println(e);}
	 catch(IllegalAccessException e){System.out.println(e);} 
	 catch (InstantiationException e){System.out.println(e);}
	 /*finally{
	  if(fr!=null)try{fr.close();}catch(IOException e){}
	 }*/
	 
 }
	private Hashtable<String, Action>ht=new Hashtable<>();
 
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
  
  act=ht.get(urlpath);
  
  ActionForward forward=act.execute(request, response);
  
  if(forward.isRedirect())
  {
   response.sendRedirect(forward.getPath());
   
  }
  else
  {
   RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
   disp.forward(request, response);
   
  }
  
  
 }

}
