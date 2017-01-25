import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class A6LineNumberReadertest {

	public static void main(String[] args) 
	{
		LineNumberReader lineread=null;
	
			try {
				lineread = new LineNumberReader(new FileReader("member.txt"));
				String content = lineread.readLine();
				
				while((content=lineread.readLine())!=null)
				{
					int su = lineread.getLineNumber();
					System.out.println(su+"\t"+content);
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
				
			}catch(IOException e)
			{
				System.out.println(e);
			}
			finally{if(lineread!=null);try{lineread.close();}catch(IOException e){};}
		
	}

}
