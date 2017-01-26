/* 생성자(Constructor) 객체를 생성하는것
 * 클래스이름과 같은 이름의 메서드 모양(리턴이 없어야함)
 * 호출시점:new 할때 객체가 만들어질때 자동으로 호출
 * 객체가 만들어지면서 해야 할일 :  인스턴스 변수를 초기화하는 일을 함.
* 
*/
class con1{
	
	String name;
	int age;
	con1(String n, int a)// 밑에 생성자와 이름이 같다 :생성자 오버로딩(overloading) -> 생성자 여러개를 정의 할 수 있다. ,,다중정
	{                           // 생성자이름이 같고 매개변수가 1타입 2갯수 3순서가 다를때 다른 생성자로 인식.
		System.out.println("생성자호출");
		name=n;
		age=a;    //인스턴스 초기화...
		
		
	}//
	//public con1(){} default constructor(기본 생성자) 생성자가 없으면 컴파일러가 자동으로 생성자를 만듦
	con1()//no-argument constructor 생성자 :  매개변수가 없는 생성자. 만들어진 생성자의 객체가 생겨짐
	{
		
	};
	
	
}
public class ConstructTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//con1 ins = new con1(); //자동으로 생성자가 만들어진 모습
		/*con1 ins = new con1("park",20);// 객체가 만들어질때 생성자 자동 호출
		con1 ins2=new con1("kim",44);*/
	}

}
