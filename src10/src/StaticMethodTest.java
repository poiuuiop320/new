/*클래스변수     : 클래스이름.변수 메서드영역에 할당되고 클래스로 로딩시 읽어진다.
 * 클래스메서드 : 클래스이름.메서드
* 지역변수 (매개변수 포함)
* 인스턴스 변수는 사용못함
* 
*/
class StMethod1 
{
	String name;
	static String addr;
	public static void prt(int age)//클래스 메서드/ static 메서드 /정적 메서드 같은의미임

	{  
		int su =20;
		System.out.println(addr);
		//System.out.println(name);
		System.out.println("prt");
		System.out.println(su);
	}
}
public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다른 클래스 메서드를 사용할시
		StMethod1.prt(10);

	}

}
