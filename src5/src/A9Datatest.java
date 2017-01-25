import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A9Datatest {

	public static void main(String[] args) 
	{
		DataInputStream dis=null;
	      try{
	    	    dis=new DataInputStream(new FileInputStream("a.txt"));
	    	    String name=dis.readUTF();
	    	    int age=dis.readInt();
	       System.out.println("name:"+name);
	       System.out.println("age:"+age);
	      }catch(FileNotFoundException e)
	      {
	    	  System.out.println(e);
	      } catch(IOException e)
	      {
	    	  System.out.println(e);
	      }
	      finally{
	    	  if(dis!=null) try{ dis.close();} catch(IOException e){}
	    	  
	      }
	}

}
