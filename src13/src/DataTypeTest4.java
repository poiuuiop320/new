import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DataTypeTest4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

System.out.println("이름 입력");
String name = in.readLine();
System.out.println("국어점수 입력");
int kor=Integer.parseInt(in.readLine());
System.out.println("영어점수 입력");
int eng=Integer.parseInt(in.readLine());
System.out.println("수학점수 입력");
int math=Integer.parseInt(in.readLine());
int tot=kor+eng+math;
double avg=(double)tot/3; // int형을 나누고 형변환.
double avg2=tot/3.0;          //float형을 나누기한것.
System.out.println("이름"+name);
System.out.println("국어"+kor);
System.out.println("영어"+eng);
System.out.println("수학"+math);
System.out.println("총점"+tot);
System.out.println("평균"+avg);
System.out.println("평균"+avg2);

//System.out.println("name:"+name);
//System.out.println("input age");
 //int age=Integer.parseInt(in.readLine());
 //System.out.println("name : "+name);
 //System.out.println("age:"+age);
 
	}

}
