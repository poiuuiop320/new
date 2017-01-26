import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class B1ObjectOutputtest {

	public static void main(String[] args) 
	{
		ObjectOutputStream oos=null;
		try
		{
			oos=new ObjectOutputStream(new FileOutputStream("tt.txt"));
			B1Member m = new B1Member("hong", 22,"seoul");
			oos.writeObject(m);
			System.out.println("¿Ï·á");
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		finally
		{
		if(oos!=null)try{oos.close();}catch(IOException e){};	
		}
	}
	}


