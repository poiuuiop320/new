/*추상클래스                              인터페이스
 * 객체 생성못함                          객체생성못함
 * abstract                                   interface
 * extends                                   implements
 * 단일 상속                                여러개 상속(기능추가)
 * 인스턴스변수, final static          public static final
 * 일반메서드+추상메서드            public abstract
 * 생성자 사용가능                      생성자 x 
 *
*/
interface A
{
	void prt();
}
interface B
{
	void show();
}
class AB implements A,B
{
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
System.out.println("show");
	}

	@Override
	public void prt() {
		// TODO Auto-generated method stub
System.out.println("prt");
	}


}
public class A4InterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A ins = new A();
		//B ins2 = new B();
		
		A ins = new AB();
		ins.prt();  //A타입 가리키는거
		B ins2 = new AB();
		ins2.show(); //B타입 가리키는거
	}

}
