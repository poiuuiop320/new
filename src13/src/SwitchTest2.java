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
	System.out.println("��");
	break;
case 8:
	System.out.println("��");
	break;
case 7:
	System.out.println("��");
	break;
case 6:
	System.out.println("��");
	break;
	default:
		System.out.println("��");
		break;
	}

}
}
