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
			socket=server.accept();//�ϴ� ���ѹ��� accept��.��Ƶ־��Ѵ�.�������������� ������ ���Ͽ� �ٻѸ�
			MultipleCilentThread th=new MultipleCilentThread(socket);
			
			Thread job=new Thread(th);
			job.start();
			}
		}
		catch(IOException e	){System.out.println(e);
		
		}

	}

}
