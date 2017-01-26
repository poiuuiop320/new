package net3.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client_rec_thread extends Thread{
	private Socket client;
	public Client_rec_thread(Socket client) {
		this.client=client;

	}

	@Override
	public void run() {
		BufferedReader read=null;
		try{
			
			read=new BufferedReader(new InputStreamReader(client.getInputStream()));
			while(true)
			{
				String msg=read.readLine();
				if(msg==null)
					break;
				System.out.println("¼ö½Å"+msg);
			}
		}catch(IOException e){System.out.println(e.getMessage());}
		finally{
			if(read!=null)try{read.close();}catch(IOException e){System.out.println(e.getMessage());
		}
	}

	}
}
