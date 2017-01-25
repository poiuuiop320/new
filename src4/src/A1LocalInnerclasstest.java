abstract class test
{
	abstract void prt();
}
public class A1LocalInnerclasstest {

	public static void main(String[] args)
	{
		test ins = new test() {
			
			@Override
			void prt() {
				// TODO Auto-generated method stub
				System.out.println("test-prt");
			}
		};
		ins.prt();
		test ins2 = new test() {
			
			@Override
			void prt() {
				// TODO Auto-generated method stub
				System.out.println("prtprt");
			}
		};
		ins2.prt();
	}

}
