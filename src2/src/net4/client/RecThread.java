package net4.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecThread extends Thread{
	private Socket socket;
	private String id;

	public RecThread(Socket socket,String id)
	{	
		this.id = id;
		this.socket = socket;


	}

	@Override
	public void run() 
	{
		BufferedReader in=null;
		try{
		 in=new BufferedReader(new InputStreamReader( socket.getInputStream()));
		while(true)
		{
		  String msg=in.readLine();
		  if(msg==null)
			  break;
		System.out.println(msg);
			
		}
		 
		 
		 
		} catch(IOException e)
		{
			System.out.println(e);
		}
}
	
}



