import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A5BufferedReadertest {

	public static void main(String[] args) 
	{
		BufferedReader br=null;//
		try
		{
			br=new BufferedReader(new FileReader("member.txt"));
			/*	while(true)
			{
				String content=br.readLine();
				if(content==null)break;
				System.out.println(content);
			}*/
			String content=null;
			while((content=br.readLine())!=null)
			{
				System.out.println(content);

			}
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
			if(br!=null)try{br.close();}catch(IOException e){};
		}
	}

}
