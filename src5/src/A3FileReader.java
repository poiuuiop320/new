import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A3FileReader {

	public static void main(String[] args) 
	{
		  FileReader fr=null;//
          try{
       	   fr=new FileReader("hello.txt");
       	   while(true)
       	   {
       		 int ch=  fr.read();
       		 if(ch==-1) break;
       		     System.out.print((char)ch);
       	   }
       	int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.println((char)ch);
		}
          }catch(FileNotFoundException e)
          { 
       	  System.out.println("�ش� ������ �����ϴ�"+e);  
          }catch(IOException e)
          {
       	   System.out.println("����¿���"+e);
          }
          
          finally{
       	   if(fr!=null)
       		   try{ fr.close();} catch(IOException e){}
       	   
          }
	}

}
