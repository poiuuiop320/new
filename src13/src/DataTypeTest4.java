import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DataTypeTest4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

System.out.println("�̸� �Է�");
String name = in.readLine();
System.out.println("�������� �Է�");
int kor=Integer.parseInt(in.readLine());
System.out.println("�������� �Է�");
int eng=Integer.parseInt(in.readLine());
System.out.println("�������� �Է�");
int math=Integer.parseInt(in.readLine());
int tot=kor+eng+math;
double avg=(double)tot/3; // int���� ������ ����ȯ.
double avg2=tot/3.0;          //float���� �������Ѱ�.
System.out.println("�̸�"+name);
System.out.println("����"+kor);
System.out.println("����"+eng);
System.out.println("����"+math);
System.out.println("����"+tot);
System.out.println("���"+avg);
System.out.println("���"+avg2);

//System.out.println("name:"+name);
//System.out.println("input age");
 //int age=Integer.parseInt(in.readLine());
 //System.out.println("name : "+name);
 //System.out.println("age:"+age);
 
	}

}
