class Super2
{
	int su = 10;
	public void view()
	{
		System.out.println("super view");
	}
}
class Sub2 extends Super2
{
	int su =20;
	public void view()
	{
		System.out.println("sub view");
	}
	public void prt()
	{
		view();//this.view();this �� �����Ȱ��̰�
		super.view();//super�� ������ ������ �ѰͿ��� �ٽ� �������� �θ� �����Ҽ��ִ�.
		//System.out.println(this.su+","+super.su);
	}
}
public class A7SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 ins = new Sub2();
		ins.prt();
		//�ش� �޼���ȿ��� super�� ����ؼ� �θ� �޼��带 �����Ѵ�.
		
	}

}
