package com.kic.Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class DBConnection
{
 public static final Connection getConnection()
 

  {
   Connection conn=null;


   try{
    InitialContext initialcontext=new InitialContext();
    Context context= (Context)initialcontext.lookup("java:/comp/env");
    DataSource datasource = (DataSource)context.lookup("jdbc/kic");
    conn=datasource.getConnection();

   }catch(NamingException e){System.out.println(e.getMessage());}
   catch(SQLException e){System.out.println(e.getMessage());}
   return conn;
  }




}
