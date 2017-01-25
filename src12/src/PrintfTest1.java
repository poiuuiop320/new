import java.io.*;
public class PrintfTest1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("kor input"); 		
int kor=Integer.parseInt(in.readLine());
		System.out.println("eng input");
		int eng=Integer.parseInt(in.readLine());
		System.out.println("input name");
		String name=in.readLine();
		int tot=kor+eng;
		float avg=tot/2.0f;//계산
		String result="";
		switch((int)(avg/10))//괄호안에 계산하고 캐스팅 시킴.(강제 형변환)
		{
		case 10:
		case 9:result = "수";
		case 8:result ="우";
		case 7:result ="미";
		case 6:result ="양";
		default :result = "가";}
		System.out.printf("이름:%s\n",name);
		System.out.printf("국어:%d\n",kor);
		System.out.printf("영어:%d\n",eng);
		System.out.printf("총점:%d\n",tot);
		System.out.printf("평균:%.2f\n",avg);
		System.out.printf("성취도:%s\n",result);
		
		}
			
		
		
	}

