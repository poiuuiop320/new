class outer2
{
	private String name="hong";//
	private static String name1="park";
	public void view()
	{
		inner ins=new inner();
		ins.prt();//��ü�������� �ٷ��.
		System.out.println(name1);
		System.out.println(outer2.name1);
	}
	class inner
	{
		String addr="seoul";
//		public static int su=20;            //�Ұ��� ���� �ٲܼ� �־static�� �ʵ尴ü
		public static final int su=20;//����
		/*public static void prt2()//static�޼���
		{
			System.out.println("prt");
		}*/
		public void prt()
		{
			System.out.println(outer2.name1);
			name="kim";
			System.out.println(name);
			System.out.println("prt");
		}
	}
}
public class B7Nesttest {

	public static void main(String[] args) 
	{
	outer2 ins = new outer2();
	ins.view();
	}
}
