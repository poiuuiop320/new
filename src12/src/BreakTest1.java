//import java.io.*;
public class BreakTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
/* for(;;)//���ѷ���
 {
	 int i = Integer.parseInt(in.readLine());
	 if(i==0)
		 break;
	 System.out.println(i);
 }*/
/* 
 for(int i =0;i<3;i++)
 {
	 for(int j =0;j<10; j++)
	 {
		 if(j==5)break;
		 System.out.print(j+"  ");
	 }
	 System.out.println();
 }*/
 loop :for(int i =0;i<3;i++)  //�̸��� ������ �� �ִ�.
 {
	 for(int j =0;j<10; j++)
	 {
		 if(j==5)break loop; //break ���� �̸��� ����ϸ� ���ϵȴ�.
		 System.out.print(j+"  ");
	 }
	 System.out.println();
 }
	}

}
