package kic.exception;

import java.io.IOException;

class User3
{
	public void read(int su) throws IOException
	{
		if(su<2)
			throw new IOException();
		else
			System.out.println(su);
	}
}
public class Exception5 {

	public static void main(String[] args) /*throws IOException*/{
		User3 ins = new User3();
		try {
			ins.read(1);
		}catch(IOException e)
		{
			System.out.println("입력값2이상 넣어"+e) ;//+e tostring
		}

	}

}
