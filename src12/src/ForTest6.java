import java.io.*;
public class ForTest6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ù��");
		int start= Integer.parseInt(in.readLine());
		System.out.println("����");
		int end = Integer.parseInt(in.readLine());
		for(int i=1;i<=9;i++) //�ܺ� ������ 
		{
		
			for(int j=start;j<=end;j++){
			System.out.print(j+"*"+i+"="+(j*i));	
			}
			System.out.println();
		}		
	}

}
