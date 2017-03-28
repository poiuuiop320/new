package service;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Service1 {

 public void prt()
 {

       System.out.println("prt!!!");
 }

   public void view()
   {
     System.out.println("view");
   }
 
   public int show(int su) throws IOException
   {
    if(su>0)
    {
    System.out.println("show!!");
    return su+10;
    }
    else
     throw new IOException();
   }
}
