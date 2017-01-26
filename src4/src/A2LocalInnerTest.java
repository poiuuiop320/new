interface Local
{
	void view();//public abstract 가 생략되있는것
}
public class A2LocalInnerTest {

	public static void main(String[] args)
	{
		Local ins = new Local() {

			@Override
			public void view() {
				// TODO Auto-generated method stub
				System.out.println("view");		
			}
		};
		ins.view();
		Local ins2 = new Local() {

			@Override
			public void view() {
				// TODO Auto-generated method stub
				System.out.println("view2");		
			}
		};
		ins2.view();
		
		
	}

}
