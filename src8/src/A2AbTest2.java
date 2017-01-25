abstract class T1
{
	public void prt()
	{
		System.out.println("t1 prt()");
	}
	public abstract void show();
}
class T2 extends T1
{
	public void view()
	{
		System.out.println("T2 view");
	}

	@Override
	public void show() {//상위에 머리만있는 메서드때문에 하위에서 만들어줘야한다.
		// TODO Auto-generated method stub
		System.out.println("T2 show method");
	}
}
public class A2AbTest2 {

	public static void main(String[] args) {
		//T1 ins = new T1();->abstract class ins 참조변수
		/*T2 ins2 = new T2();//뒤에 
		ins2.prt();ins2.view();
		T1 ins3= new T2();//
*/		//T2 ins4 = new T1();//T1 으로 객체 생성 안됨.
		T2 ins2 = new T2();
		ins2.prt();
		ins2.show();
		ins2.view();
		System.out.println("---");
		T1 ins3 = new T2();
		ins3.prt();
		ins3.show();
		//ins3.view(); 
		//T2 ins4=new T1();// 객체생성이 안됨=>추상클래스이다. 형변환(T2)해도 객체생성안된다.
		

	}

}
