class outer2
{
	private String name="hong";//
	private static String name1="park";
	public void view()
	{
		inner ins=new inner();
		ins.prt();//객체생성으로 다룬다.
		System.out.println(name1);
		System.out.println(outer2.name1);
	}
	class inner
	{
		String addr="seoul";
//		public static int su=20;            //불가능 값을 바꿀수 있어서static은 필드객체
		public static final int su=20;//가능
		/*public static void prt2()//static메서드
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
