import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2FileWritertest {

	public static void main(String[] args) 
	{
		FileWriter fw=null;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			
			fw=new FileWriter("hello.txt",true);
			System.out.println("�����Է�");
			while(true)
			{
				String content=in.readLine();
				
				if(".".equals(content))
					break;
				fw.write(content);
			}
			
//			fw.write("honggildong");
			System.out.println("������ ����");
		}
		catch(IOException e)
		{
			System.out.println(e);

		}
		finally
		{
			if(fw!=null)try{ fw.close();}catch(IOException e){}

		}
	}

}
