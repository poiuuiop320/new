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
		Socket client=null;//소켓 읽는거 쓰는거 2개
		PrintWriter pw=null;
		BufferedReader a=null;
		try {
			client=new Socket("localhost",5000);//Socket (InetAddress address, int port) //new 소켓

			pw=new PrintWriter(client.getOutputStream());//씀PrintWriter
			pw.write("안녕하세요");
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


