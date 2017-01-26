import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class A8Datatest {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("inptu name");
		
		String name=scanner.nextLine();
		System.out.println("input age");
		int age=scanner.nextInt();
		DataOutputStream dos=null;
		try
		{
			dos=new DataOutputStream(new FileOutputStream("22.txt"));
			dos.writeUTF(name);
			dos.writeInt(age);
			

		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			if(dos!=null)try{dos.close();}catch(IOException e){};
		}

	}

}
