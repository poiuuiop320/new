package net3.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_send_thread extends Thread {
	private Socket client;
	public Client_send_thread(Socket client) {
		this.client=client;
	}

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter write=null;

		try{
			write=new PrintWriter(client.getOutputStream());
			while(true)
			{
				String msg=sc.nextLine();
				if(msg.equals("bye"))break;
				write.println(msg);
				write.flush();
			}}catch(IOException e){System.out.println(e.getMessage());}
		finally{
			if(write!=null)write.close();
			if(client!=null)try{client.close();}catch(IOException e){System.out.println(e.getMessage());
			}



		}
	}
}


