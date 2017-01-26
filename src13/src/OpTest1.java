/*
 * 연산자
 * 단항연산자
 *   전위연산자 ,후위연산자
 *    부호연산자
 * 이항연산자
 *  산술연산자
 *   비교연산자
 *   논리연산자
 *   비트연산자
 *   복합대입연산자
 * 삼항연산자
 * 
 * 단항연산자
 * 
*/public class OpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=++x; //전위
System.out.println(x+","+y);
x=10;
y=x++;//후위
System.out.println(x+","+y);
	}

}
