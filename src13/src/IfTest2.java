import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*int jumsu =7;
if(jumsu>=90)
	System.out.println("수");
else if (jumsu>=80)
	System.out.println("우");
else if(jumsu>=70)
	System.out.println("미");
else if (jumsu>=60)
	System.out.println("양");
else System.out.println("가");*/
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("이름입력");
String name=in.readLine();
System.out.println("국어");
int kor=Integer.parseInt(in.readLine());
System.out.println("영어");
int eng=Integer.parseInt(in.readLine());
System.out.println(name);
if (kor>=90 &&eng >=90)
	System.out.println("very good");
else if(kor>=90||eng>=90)
	System.out.println("good");
else System.out.println("bad");

String result="";
if (kor>89 && eng>89)
	result="very good";
else if (kor>89 || eng>89)
	result="good";
	else result="bad";
System.out.println("이름:"+name);
System.out.println("국어:"+kor);
System.out.println("영어:"+eng);
System.out.println("결과:"+result);
	}

}
