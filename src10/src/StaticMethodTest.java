/*Ŭ��������     : Ŭ�����̸�.���� �޼��念���� �Ҵ�ǰ� Ŭ������ �ε��� �о�����.
 * Ŭ�����޼��� : Ŭ�����̸�.�޼���
* �������� (�Ű����� ����)
* �ν��Ͻ� ������ ������
* 
*/
class StMethod1 
{
	String name;
	static String addr;
	public static void prt(int age)//Ŭ���� �޼���/ static �޼��� /���� �޼��� �����ǹ���

	{  
		int su =20;
		System.out.println(addr);
		//System.out.println(name);
		System.out.println("prt");
		System.out.println(su);
	}
}
public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ٸ� Ŭ���� �޼��带 ����ҽ�
		StMethod1.prt(10);

	}

}
