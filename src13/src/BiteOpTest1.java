/*
 *비트연산 &:and |:or ~:not ^:xor ex(clusive or)
 *음수를 표현하는 방법 2의보수 : 1의보수(0>1, 1>0)+1
 *
*/public class BiteOpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int result=~a;//2의보수로 표현 -10:~a+1 => -a:-11
System.out.println(result);
int su1=10;
int su2=20;
int result2=su1|su2;// and 비트 연산
System.out.println(result2);

	}

}
