import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*int jumsu =7;
if(jumsu>=90)
	System.out.println("��");
else if (jumsu>=80)
	System.out.println("��");
else if(jumsu>=70)
	System.out.println("��");
else if (jumsu>=60)
	System.out.println("��");
else System.out.println("��");*/
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("�̸��Է�");
String name=in.readLine();
System.out.println("����");
int kor=Integer.parseInt(in.readLine());
System.out.println("����");
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
System.out.println("�̸�:"+name);
System.out.println("����:"+kor);
System.out.println("����:"+eng);
System.out.println("���:"+result);
	}

}
