/*
*/

class Override1
{
	public void prt()
	{
		System.out.println("prt!");
	}
}
class SubOverride1 extends Override1
{
	@Override //어노테이션 애너테이션
	public void prt()//
	{
		System.out.println("prt22222");
	}
	public void view()
	{
		System.out.println("view!");
	}
}
public class A1OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override1 ins =new Override1();
		SubOverride1 ins2=new SubOverride1();
		ins.prt();
		System.out.println("----");
		ins2.prt();
		System.out.println("----");
		ins2.view();
		Override1 ins3 = new SubOverride1();
		ins3.prt();
		//ins3.view(); 컴파일에러//
		
		System.out.println("----");
		SubOverride1 ins4=(SubOverride1)new Override1();
		//형변환
		
		

	}

}
