/*�߻�Ŭ����                              �������̽�
 * ��ü ��������                          ��ü��������
 * abstract                                   interface
 * extends                                   implements
 * ���� ���                                ������ ���(����߰�)
 * �ν��Ͻ�����, final static          public static final
 * �Ϲݸ޼���+�߻�޼���            public abstract
 * ������ ��밡��                      ������ x 
 *
*/
interface A
{
	void prt();
}
interface B
{
	void show();
}
class AB implements A,B
{
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
System.out.println("show");
	}

	@Override
	public void prt() {
		// TODO Auto-generated method stub
System.out.println("prt");
	}


}
public class A4InterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A ins = new A();
		//B ins2 = new B();
		
		A ins = new AB();
		ins.prt();  //AŸ�� ����Ű�°�
		B ins2 = new AB();
		ins2.show(); //BŸ�� ����Ű�°�
	}

}
