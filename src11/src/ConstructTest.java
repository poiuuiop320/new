/* ������(Constructor) ��ü�� �����ϴ°�
 * Ŭ�����̸��� ���� �̸��� �޼��� ���(������ �������)
 * ȣ�����:new �Ҷ� ��ü�� ��������� �ڵ����� ȣ��
 * ��ü�� ��������鼭 �ؾ� ���� :  �ν��Ͻ� ������ �ʱ�ȭ�ϴ� ���� ��.
* 
*/
class con1{
	
	String name;
	int age;
	con1(String n, int a)// �ؿ� �����ڿ� �̸��� ���� :������ �����ε�(overloading) -> ������ �������� ���� �� �� �ִ�. ,,������
	{                           // �������̸��� ���� �Ű������� 1Ÿ�� 2���� 3������ �ٸ��� �ٸ� �����ڷ� �ν�.
		System.out.println("������ȣ��");
		name=n;
		age=a;    //�ν��Ͻ� �ʱ�ȭ...
		
		
	}//
	//public con1(){} default constructor(�⺻ ������) �����ڰ� ������ �����Ϸ��� �ڵ����� �����ڸ� ����
	con1()//no-argument constructor ������ :  �Ű������� ���� ������. ������� �������� ��ü�� ������
	{
		
	};
	
	
}
public class ConstructTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//con1 ins = new con1(); //�ڵ����� �����ڰ� ������� ���
		/*con1 ins = new con1("park",20);// ��ü�� ��������� ������ �ڵ� ȣ��
		con1 ins2=new con1("kim",44);*/
	}

}
