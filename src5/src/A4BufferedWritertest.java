import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A4BufferedWritertest {

	public static void main(String[] args) 
	{
		BufferedWriter bw=null;//
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input");
		try
		{
			bw=new BufferedWriter(new FileWriter("member.txt",true) );
			while(true)
			{
				String content = sc.nextLine();//자료 얻어올수있음
				if(content.equals("."))break;
				bw.write(content);
				bw.newLine();
			}
			System.out.println("close");
		}catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			if(bw!=null)try{bw.close();}catch(IOException e){};
		}
	}

}
