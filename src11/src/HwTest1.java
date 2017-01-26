import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HwTest1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input num");
		int a=Integer.parseInt(in.readLine());
  for (int i = 0; i>=1; i--) 
  {
	for (int j = a; j >=1; j--) 
	{
		System.out.print(" ");
	}
	for (int j = 0; j >=1; j--)
	{
		System.out.print("*");
	}
 }
		
		
   
	
}
	}


