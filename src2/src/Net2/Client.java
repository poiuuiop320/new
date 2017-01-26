package Net2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		Socket client=null;//���� �д°� ���°� 2��
		PrintWriter pw=null;
		BufferedReader a=null;
		try {
			client=new Socket("localhost",5000);//Socket (InetAddress address, int port) //new ����

			pw=new PrintWriter(client.getOutputStream());//��PrintWriter
			pw.write("�ȳ��ϼ���");
			a=new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println(a);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally{
			if(a!=null) try {pw.close();} catch (Exception e2) {System.out.println(e2);}
			
			if(pw!=null)try{pw.close();}catch(Exception e){System.out.println(e);}
			if(client!=null)try{client.close();}catch(IOException e){System.out.println(e);


			}

		}
	}
}


