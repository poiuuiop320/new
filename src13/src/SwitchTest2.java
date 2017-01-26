import java.io.*;
public class SwitchTest2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int stemp=Integer.parseInt(in.readLine());
int score = stemp/10;
switch (score){
case 10: 
case 9:
	System.out.println("수");
	break;
case 8:
	System.out.println("우");
	break;
case 7:
	System.out.println("미");
	break;
case 6:
	System.out.println("양");
	break;
	default:
		System.out.println("가");
		break;
	}

}
}
