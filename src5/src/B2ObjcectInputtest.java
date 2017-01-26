import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class B2ObjcectInputtest {

	public static void main(String[] args) 
	{
	    ObjectInputStream ois=null;
        try{
        	ois=new ObjectInputStream(new FileInputStream("tt.txt"));
        	 Object o=ois.readObject();
        	   if(o instanceof B1Member)
        	   {
        		   B1Member m=(B1Member)o;
        		   System.out.println(m.getName()+", "+m.getAge());
        		   m.prt();
        	   }
        	   System.out.println("¿Ï·á!!!");
        }
        catch(IOException e)
        {
        	System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
        	System.out.println(e);
        }
        finally{
        	if(ois!=null) try{ ois.close();} catch(Exception e){}
        }
	}
}
