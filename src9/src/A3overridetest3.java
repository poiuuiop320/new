class A1
{
	public void prt()
	{
		System.out.println("prt!A1!");
	}
}
class B1 extends A1
{
	@Override
	public void prt()
	{
	System.out.println("prt BBB111");	
	}
	public void view()
	{
		System.out.println("view!!B!");
	}
}
public class A3overridetest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 ins = new A1();
		ins.prt();
		System.out.println("-----");
		B1 ins2 =new B1();
		ins2.prt();
		ins2.view();
		System.out.println("=======");
		A1 ins3 = new B1();
		ins3.prt();
	}

}
