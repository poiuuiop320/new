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
	class sungjuck2//��� Ŭ���� ���������ڸ� �ٸ��� ����� �� �ִ�.
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
		/*Student2 ins=new Student2();//student2�� ����
		Student2.sungjuck2 subins=ins.new sungjuck2();//sungjuck2������
		Student2.sungjuck2 subins2=new Student2().new sungjuck2();*/
		Student2.sungjuck2 ins=new Student2().new sungjuck2();
		ins.prt();
	
	}
}
