import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
public class B3service {
	private BufferedWriter bw=null;
	private void initsave()
	{
		try{bw=new BufferedWriter(new FileWriter("insa.txt",true));

		}
		catch(IOException e){

		}
	}


	public void saveFile (B3vo data)
	{
		initsave();
		try{
			bw.write(data.getName()+data.getAge());
			bw.newLine();
		}catch(IOException e){}
		finally{
			if(bw!=null)try{bw.close();}catch(Exception e){}
		}
	}
	public Vector viewFile()
	{
		BufferedReader br = null;
		Vector v= new Vector();
		
		try
		{
			br=new BufferedReader(new FileReader("insa.txt"));
			String content=null;
			StringTokenizer stk;
			while((content=br.readLine())!=null)
			{
				stk=new StringTokenizer(content, ",");
				String name=stk.nextToken();
				int age=Integer.parseInt(stk.nextToken().trim());
				Vector data=new Vector();
				 data.add(name);
				 data.add(age);
			   v.add(data);


			}
		}catch(FileNotFoundException e)
		{
			System.out.println(e);

		}catch(IOException e)
		{
			System.out.println(e);
		}finally{if(br!=null)try{br.close();}catch(IOException e){}
		}
		return v;
		
	}
}

