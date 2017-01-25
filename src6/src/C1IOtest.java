import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1IOtest {

	public static void main(String[] args) /*throws IOException*/{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true)
			{
				String name = in.readLine();		
				if(name.equals("n"))
					break;
				System.out.println(name);
			}

		}

		catch(IOException e){

		}



		/*		InputStreamReader in = new InputStreamReader(System.in);
		try{

					while(true)
		{
			System.out.println("input");
			char ch = (char)in.read();

			if(ch=='.')break;
			System.out.println(ch);
		}char p;
			while( (p=(char) in.read())!='.')
{
System.out.println("p");
}
		}catch(IOException e){
			System.out.println(e);
		}*/

	}

}
