class Method1
{
	//함수->메서드
/* 
 * 
 * 
 * 메서드명()
 *  리턴타입 메서드명(매개변수,매개변수)
 *{
 * 
 *}
 * 리턴타입 
 * 리턴이 없는경우 : void
*/
	void prt()   //메서드 생성
	{
	 System.out.println("hello");
	 System.out.println("world");
	}
	/*int view() //리턴값의 타입을 메서드 이름 옆에 쓴다.
	{
		//int a=20;//
		System.out.println("view method!");//
		return 100;//
	}*/
	/*double view() //리턴값의 타입을 메서드 이름 옆에 쓴다.
	{
		int a=20;//
		System.out.println("view method!");//
		return 10.2;//
	}*/
	/*String view() //리턴값의 타입을 메서드 이름 옆에 쓴다.
	{
		int a=20;//
		System.out.println("view method!");//
		return "string";//
	}*/
	/*float view() //리턴값의 타입을 메서드 이름 옆에 쓴다.
	{
		int a=20;//
		System.out.println("view method!");//
		return 10.2f;//
	}*/
	
	/*int[] view1() //리턴값의 타입을 메서드 이름 옆에 쓴다.
	{
		int a=20;//
		System.out.println("view method!");//
		return new int [3];//
	}*/
	int view1() //리턴값의 타입을 메서드 이름 옆에 쓴다.
	{
		//int a=20;//
		System.out.println("view method!");//
		int kor=10;
		return kor;//
	}
}
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Method1 ins=new Method1(); //클래스안 객체 생성
  ins.prt();                              //메서드 호출
 // ins.view1();
  int result=ins.view1();//받은 값을 int 변수명에 저장한다.
  System.out.println(result);
	}

}
