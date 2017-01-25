class F1
{
	public final void prt() //override 할 수 없다 final을 씀으로
	{
		System.out.println("prt F1");
	}
}
class F2 extends F1
{
	/*@Override
	public void prt()//Multiple markers at this line- overrides F1.prt- Cannot override the final method 	 from F1
	{
		System.out.println("F2 prt");
	}*/
}
public class A4FinalMethodTest {

	public static void main(String[] args) {
		// 

	}

}
