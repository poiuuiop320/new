/* 형변환
 * 자동형변환
 * 강제형변환
 * 
 * byte>short>int>long>float>double
 *           char
*/

public class DateTypeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte a=20;
int b=a;
System.out.println(a+","+b);//자동형변환
int su1=30;
//byte su2=su1;//에러
byte su2=(byte)su1;//강제 형변환
System.out.println(su1+","+su2);
//long su3=50;//int type을 롱타입으로 자동형변환된것
 //int su4=10l;
//int su4=(int)10l;
//System.out.println(su3);
float su5=20.2f;
int su6=(int)su5;
System.out.println(su5+","+su6);
//float p1=20.3;//double type
//double p2=30.4f;//자동 형변환
char ch2='a';
int such2=ch2;
System.out.println(ch2+ ","+such2);
int test1='A';
char test2=(char)test1;
System.out.println(test1+","+test2);



	}

}
