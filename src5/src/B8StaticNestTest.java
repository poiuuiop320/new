class N1
{
	static class N2
	{
		public void prt()
		{
			System.out.println("prt");
		}
		public static void view()//n2 static 없으면 에러
		{
			System.out.println("view");
		}
	}
	
}
public class B8StaticNestTest {

	public static void main(String[] args) 
	{
	N1.N2 ins= new N1.N2();
	ins.prt();
	N1.N2.view();
	}
}
