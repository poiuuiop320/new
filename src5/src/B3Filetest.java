import java.io.File;
import java.io.IOException;

public class B3Filetest {

	public static void main(String[] args) throws IOException{
//		File f1=new File("D:/windows");
		File f1=new File("D:\\");
		String[] list =f1.list();
		File f2=new File(f1,"TT");
		boolean result=f2.mkdir();
		if(result)
			System.out.println(result);
		else
			System.out.println(result);
//		File f3=new File("d:||TT/a1.txt");
		/*File f3=new File("d:\\TT","a2.txt");
		result=f3.createNewFile();
		if(result)
			System.out.println(result);
		else
			System.out.println(result);*/
		/*File f4=new File("d:\\TT");
		if(f4.exists())
		f4.delete();
		else
			System.out.println(f4);*/
		/*for (int i = 0; i < list.length; i++) 
		{
			System.out.println(list[i]);

		}*/
		/*for (String index : list) {
			System.out.println(index);
		}*/
		

	}
}
