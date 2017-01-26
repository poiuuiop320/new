package net4.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread{
	private Socket socket;
	private String id;

	public SendThread(Socket socket,String id) {
		this.id=id;		
		this.socket=socket;
	}

	@Override
	public void run() {

		  Scanner sc=new Scanner(System.in);
		 PrintWriter out=null;
		 try{
		  out=new PrintWriter(socket.getOutputStream());
	      out.print(id);
	      out.flush();
		  while(true)
	      {
	    	  String msg=sc.nextLine();
	    	  if(msg.equals("bye"))
	    		  break;
	    	  out.println(id+":"+msg);
	    	  out.flush();
	      }
		 } catch(IOException e)
		 {
			 System.out.println(e);
		 }finally{
			 if(socket!=null) try{ socket.close();} catch(IOException e){}
		 }
	}


}
