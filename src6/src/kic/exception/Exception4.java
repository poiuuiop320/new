package kic.exception;

import java.io.IOException;

class User2
{


	public void prt() throws IOException
	{
		System.out.println("prt!");
	}
}
public class Exception4 {

	public static void main(String[] args) {
		User2 ins = new User2();
		try{
       	 ins.prt();
       	 
        }catch(IOException e)
        {
       	 System.out.println("처리합니다");
        }
		

	}

}
