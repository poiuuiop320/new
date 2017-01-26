package net4.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleCilentThread implements Runnable{
	static List<PrintWriter> arr =Collections.synchronizedList(new ArrayList<>());	
	private Socket socket=null;
	String id="";
	PrintWriter  out=null;

	public MultipleCilentThread(Socket socket)//생성할때마다 클라이언트 소켓을 얻어옴 배열에 넣는다.
	{
		this.socket=socket;
		PrintWriter out=null;
		try{
			out=new PrintWriter(socket.getOutputStream());
			arr.add(out);
		}catch(IOException e){System.out.println(e);}


	}
	@Override
	public void run() 
	{
		BufferedReader read=null;
		try{

			read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			id=read.readLine();
			for (PrintWriter out : arr) {
				out.println(id+"in");
				out.flush();
			}
			while(true)
			{
				String msg=read.readLine();
				if(msg==null)break;
				for (PrintWriter out : arr) {
					out.println(msg);
					out.flush();
				}
			}

		}catch(IOException e){
			System.out.println(e);
		}finally{
			arr.remove(out);
			for (PrintWriter out : arr) {
				out.println(id+"out");
				out.flush();
			}
			if(socket!=null)try{socket.close();}catch(IOException e){ System.out.println(e);}
		}
	}

}

