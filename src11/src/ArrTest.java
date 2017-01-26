import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
/* String[] name=new String[3];// 선언 초깋화후에 값넣을수있다.
 name[0]="hong gil dong";
 name[1]="kim ha na";
 name[2]="park";
 
 for (int i = 0; i < name.length; i++) {
	System.out.println(name[i]);*/
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("input inwon"); //인원
  int inwon =Integer.parseInt(in.readLine());
  
	String[] name=new String[inwon];
	int[] kor=new int[inwon];
	int[] eng=new int[inwon];
	int[] tot=new int[inwon];
	float[] avg=new float[inwon];
  
   for (int i = 0; i < inwon; i++) {
	   System.out.println("input name");
	   name[i]=in.readLine();
	   System.out.println("input kor");
	   kor[i]= Integer.parseInt(in.readLine());
	   System.out.println("input eng");
	   eng[i]= Integer.parseInt(in.readLine());
	   tot[i]=kor[i]+eng[i];
	   avg[i]=tot[i]/3.0f;	
 }
   System.out.print("name\t kor\t eng\t tot\t avg\t \n");
   for (int i = 0; i < inwon; i++) {
	System.out.printf("%s\t %d\t %d\t %d\t %.1f\t \n", name[i],kor[i],eng[i],tot[i],avg[i]);
	
}
	
	
}
  
  
}
	



