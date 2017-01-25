package net3.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.UnknownException;

public class Server {

	public static void main(String[] args) {

		ServerSocket server=null;
		Socket socket=null;
		try{

			server = new ServerSocket(5000);
			socket=server.accept();
			Server_rec_thread th1=new Server_rec_thread(socket);
			Server_send_therad th2=new Server_send_therad(socket);
			th1.start();
			th2.start();

		}catch(UnknownException e){System.out.println(e.getMessage());}
		catch(IOException e){System.out.println(e.getMessage());
		}
		finally {
			
		
		}
	}

}
