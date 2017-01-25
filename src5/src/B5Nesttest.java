class Student2
{
	private String name;
	private int age;

	public void stprt()
	{
		System.out.println("stprt");
		sungjuck2 s=new sungjuck2();
		s.prt();
	}
	class sungjuck2//멤버 클래스 접근제한자를 다르게 사용할 수 있다.
	{
		public void prt()
		{
			System.out.println("student-sungjuck-prt");
		}
	}
}
public class B5Nesttest {

	public static void main(String[] args) 
	{
		/*Student2 ins=new Student2();//student2만 접근
		Student2.sungjuck2 subins=ins.new sungjuck2();//sungjuck2만접근
		Student2.sungjuck2 subins2=new Student2().new sungjuck2();*/
		Student2.sungjuck2 ins=new Student2().new sungjuck2();
		ins.prt();
	
	}
}
