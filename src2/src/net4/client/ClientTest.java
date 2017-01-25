package net4.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("in");
		String id=sc.nextLine();
		Socket socket=null;
		try{
			socket=new Socket("192.168.0.42",5000);
			SendThread job1=new SendThread(socket,id);
			RecThread job2=new RecThread(socket,id);

			job1.start();
			job2.start();
		}catch(IOException e){System.out.println(e);}


	}

}
