import java.io.*;

public class ForTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���Է�");
		
		int su1=Integer.parseInt(in.readLine());
		System.out.println("��");
		int su2=Integer.parseInt(in.readLine());
/*   for	(int i=su1;i<=su2;i++)
	   System.out.print(i+"  ");*/
		int tot=0;
		for(int i=su1;i<=su2;i++)
		{
			System.out.println(i+"");
			tot+=i; //�������� i���� ��Ӵ��Ѵ�.
		}
	 System.out.println(tot); 
   
	
	}
  
}
