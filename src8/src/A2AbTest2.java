abstract class T1
{
	public void prt()
	{
		System.out.println("t1 prt()");
	}
	public abstract void show();
}
class T2 extends T1
{
	public void view()
	{
		System.out.println("T2 view");
	}

	@Override
	public void show() {//������ �Ӹ����ִ� �޼��嶧���� �������� ���������Ѵ�.
		// TODO Auto-generated method stub
		System.out.println("T2 show method");
	}
}
public class A2AbTest2 {

	public static void main(String[] args) {
		//T1 ins = new T1();->abstract class ins ��������
		/*T2 ins2 = new T2();//�ڿ� 
		ins2.prt();ins2.view();
		T1 ins3= new T2();//
*/		//T2 ins4 = new T1();//T1 ���� ��ü ���� �ȵ�.
		T2 ins2 = new T2();
		ins2.prt();
		ins2.show();
		ins2.view();
		System.out.println("---");
		T1 ins3 = new T2();
		ins3.prt();
		ins3.show();
		//ins3.view(); 
		//T2 ins4=new T1();// ��ü������ �ȵ�=>�߻�Ŭ�����̴�. ����ȯ(T2)�ص� ��ü�����ȵȴ�.
		

	}

}
