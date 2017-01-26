package net3.client;

import java.io.IOException;
import java.net.Socket;

import org.omg.CORBA.portable.UnknownException;

public class Client {

	public static void main(String[] args) 
	{
		Socket client =null;
		try{
			client=new Socket("192.168.0.42",5000);
			Client_rec_thread th1=new Client_rec_thread(client);
			Client_send_thread th2=new Client_send_thread(client);
			th1.start();
			th2.start();

		}catch(UnknownException e){System.out.println(e.getMessage());}
		catch(IOException e){System.out.println(e.getMessage());	}
	}



}
