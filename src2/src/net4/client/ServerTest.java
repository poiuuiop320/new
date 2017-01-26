package net4.client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket socket=null;
		try{
			server=new ServerSocket(5000);
			
			while(true){
			socket=server.accept();//일대 다한번만 accept됨.담아둬야한다.여려개받으려면 각각의 소켓에 다뿌림
			MultipleCilentThread th=new MultipleCilentThread(socket);
			
			Thread job=new Thread(th);
			job.start();
			}
		}
		catch(IOException e	){System.out.println(e);
		
		}

	}

}
