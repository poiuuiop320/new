package net3.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Server_send_therad extends Thread{
	private Socket socket;
	public Server_send_therad(Socket socket)
	{
this.socket=socket;
		
	}
	public void run()
	{
//		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		PrintWriter write=null;		
		try {
			write=new PrintWriter(socket.getOutputStream());
			while(true)
			{
				String msg=sc.nextLine();
				if(msg.equals("bye"))break;
				write.println(msg);
				write.flush();
			}
			
		} catch (IOException e) {System.out.println(e.getMessage());}
		finally{
			
			if(socket!=null)try{socket.close();}catch(IOException e){}
		}
		
	}

}
