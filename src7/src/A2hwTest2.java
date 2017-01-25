import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class A2hwTest2 {

	public static void main(String[] args)throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input name");
		String name=in.readLine();
		System.out.println("input jumin");
		String jumin=in.readLine();//나이 성별 
		System.out.println("input email");
		String email=in.readLine();
		char g=jumin.charAt(7);
		//char 타입은 ==
		String y=jumin.substring(0,2);
		GregorianCalendar gc=new GregorianCalendar();
		int nowyear=gc.get(Calendar.YEAR);
		int age=0;
		if(g=='1'||g=='2')
		{
			age=nowyear-Integer.parseInt("19"+y);
			age+=1;

		}
		else
		{
			age=nowyear-Integer.parseInt("20"+y);
			age+=1;
		}

		System.out.println("name:"+name);
		if(g=='1'||g=='3')
		{
			System.out.println("성별 :남");

		}
		else 
			System.out.println("성별 :여");
		System.out.println("나이:"+age);
		
		String id=email.substring(0,email.indexOf("@"));
		String domain=email.substring(email.indexOf("@")+1);
		
		System.out.println("id : "+id);
		System.out.println("도메인 :"+domain);
		

	}

}
