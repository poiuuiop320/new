package net3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Server_rec_thread extends Thread{
	private Socket socket;
	public Server_rec_thread(Socket socket)
	{
		this.socket=socket;
	}
	public void run()
	{
		BufferedReader read=null;
		try {
			read=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true)
			{
				String msg=read.readLine();
				if(msg==null)
					break;
				System.out.println("¼ö½Å"+msg);
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally{
			if(read!=null)try{read.close();}catch(IOException e){System.out.println(e.getMessage());}
			
		}

	}
}

