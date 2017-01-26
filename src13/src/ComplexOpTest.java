
public class ComplexOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su = 10;
		int su2 = 20;
		
		su2+=su;//복합대입 연산자 .su2=su2+su1;
		System.out.println(su+","+su2);
		int a=10;
		int b=20;
		int c=30;
		c*=a+b;//c*(a+b); 복합대입은 오른쪽 먼저 계산..
		System.out.println(c);
	}

}
