import java.io.*;
public class ForTest5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�Է�");
		
		int i=Integer.parseInt(in.readLine());
         //ù����
		for(int j =i;j>0;i--)
		{
			for(int k =i;k>0;k--){
				System.out.print("*");
			}
		System.out.println();
		j--;
		}
		//�ι�°
		System.out.println("�Է�");
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
