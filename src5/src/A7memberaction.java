import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A7memberaction {

	public void memberAppend(String filename,String name,int age)
	{
		BufferedWriter bw=null;
		try{
			bw=new BufferedWriter(new FileWriter(filename,true));
			bw.write(name+","+age+"\n");
		}catch(IOException e){
			System.out.println(e);
		}finally{
			if(bw!=null)try{bw.close();}catch(IOException e){};
		}

	}
	public void memberRead()
	{
		

	}

}
