import java.io.*;
public class ForTest6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫단");
		int start= Integer.parseInt(in.readLine());
		System.out.println("끝단");
		int end = Integer.parseInt(in.readLine());
		for(int i=1;i<=9;i++) //외부 가로줄 
		{
		
			for(int j=start;j<=end;j++){
			System.out.print(j+"*"+i+"="+(j*i));	
			}
			System.out.println();
		}		
	}

}
