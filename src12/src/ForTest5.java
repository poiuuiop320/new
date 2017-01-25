import java.io.*;
public class ForTest5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력");
		
		int i=Integer.parseInt(in.readLine());
         //첫문제
		for(int j =i;j>0;i--)
		{
			for(int k =i;k>0;k--){
				System.out.print("*");
			}
		System.out.println();
		j--;
		}
		//두번째
		System.out.println("입력");
		int a=Integer.parseInt(in.readLine());
		String m="";
		for(int j =a;j>0;a--)
		{ System.out.print(m+" ");
			for(int k =a;k>0;k--){
				System.out.print("*");	
			}
			m+=" ";
		    System.out.println();
		    j--;
		}
		
		

	}

}
