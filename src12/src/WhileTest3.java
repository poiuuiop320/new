import java.io.*;
public class WhileTest3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("continue? (y/n)");
			String yn=in.readLine();
			if(yn.equals("n")||yn.equals("N"))break;
			System.out.println(yn);
		}
	}

}
