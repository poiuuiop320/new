import java.io.InputStreamReader;
import java.io.*;
public class ForTest4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("높이 입력");
		
		int k=Integer.parseInt(in.readLine());
        for(int i=1;i<=4;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(k);
        		k*=2;
        	}
        	System.out.println();
        }
	}

}
