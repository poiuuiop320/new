//import java.io.*;
public class BreakTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
/* for(;;)//무한루프
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
 loop :for(int i =0;i<3;i++)  //이름을 지정할 수 있다.
 {
	 for(int j =0;j<10; j++)
	 {
		 if(j==5)break loop; //break 옆에 이름을 사용하면 리턴된다.
		 System.out.print(j+"  ");
	 }
	 System.out.println();
 }
	}

}
