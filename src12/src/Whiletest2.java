//while문으로 1 3 5 7 9 출력
import java.io.*;
public class Whiletest2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input");
		int i = Integer.parseInt(in.readLine());
		
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
 /*int i =1;
 while (i<10)
 {
	 System.out.print(i+" ");
	 i+=2;

 }
 */
	}

}
