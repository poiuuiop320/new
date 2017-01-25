class Super2
{
	int su = 10;
	public void view()
	{
		System.out.println("super view");
	}
}
class Sub2 extends Super2
{
	int su =20;
	public void view()
	{
		System.out.println("sub view");
	}
	public void prt()
	{
		view();//this.view();this 가 생략된것이고
		super.view();//super를 씀으로 재정의 한것에서 다시 재정의전 부모에 접근할수있다.
		//System.out.println(this.su+","+super.su);
	}
}
public class A7SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 ins = new Sub2();
		ins.prt();
		//해당 메서드안에서 super를 사용해서 부모 메서드를 접근한다.
		
	}

}
