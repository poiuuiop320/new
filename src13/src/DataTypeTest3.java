
public class DataTypeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte a=20;
byte b=30;
//byte c= a+b;//에러 byte, short, int 연산은 int타입으로 변한다.
byte c=(byte)(a+b);//괄호로 묶어 인트연산후 강제 형변환 int을 함
System.out.println(c);

//작은크기타입과 연산으로 큰크기에 형변환이 된다.
int a1=10;
long a2=20;
float su=a1+a2;  //float 소수점까지 저장된다.
System.out.println(su);
	}

}
