class A
{
	int su = 10;
}

public class B3ObjectTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ins = new A();
		A ins2 = new A();
		System.out.println(ins==ins2);
		System.out.println(ins.equals(ins2));//

	}

}
