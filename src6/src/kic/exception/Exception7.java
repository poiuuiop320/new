package kic.exception;

import java.io.IOException;

import javax.management.modelmbean.XMLParseException;

/*class Except
{
	public void prt() throws IOException,XMLParseException
	{
		System.out.println("prt");
	}
}*/

public class Exception7 {

	public static void main(String[] args) {
		/*Except ins = new Except();
		try{
			ins.prt();
		}catch(Exception e)//
		{
			
		}
		catch(IOException e)
		{
			
		}catch(XMLParseException e)
		{
			
		}catch(Exception e) //
		{
			
		}*/
		int su = 10;
		int suu=00;
		try{
		System.out.println(su/suu);
		}catch(Exception e){
//			System.out.println(e);//e.tostring
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
