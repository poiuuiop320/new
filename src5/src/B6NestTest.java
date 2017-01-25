class outer1
{
	private class inner1
	{
		public void prt1()
		{
			System.out.println("prt1");
		}
	}
	public class inner2
	{
		public void prt2()
		{
			System.out.println("prt2");
		}
	}
}
public class B6NestTest {

	public static void main(String[] args) 
	{
	outer1 ins = new outer1();
	outer1.inner2 ins2= ins.new inner2();
	ins2.prt2();
	}
}
