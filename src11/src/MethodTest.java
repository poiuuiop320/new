class Method1
{
	//�Լ�->�޼���
/* 
 * 
 * 
 * �޼����()
 *  ����Ÿ�� �޼����(�Ű�����,�Ű�����)
 *{
 * 
 *}
 * ����Ÿ�� 
 * ������ ���°�� : void
*/
	void prt()   //�޼��� ����
	{
	 System.out.println("hello");
	 System.out.println("world");
	}
	/*int view() //���ϰ��� Ÿ���� �޼��� �̸� ���� ����.
	{
		//int a=20;//
		System.out.println("view method!");//
		return 100;//
	}*/
	/*double view() //���ϰ��� Ÿ���� �޼��� �̸� ���� ����.
	{
		int a=20;//
		System.out.println("view method!");//
		return 10.2;//
	}*/
	/*String view() //���ϰ��� Ÿ���� �޼��� �̸� ���� ����.
	{
		int a=20;//
		System.out.println("view method!");//
		return "string";//
	}*/
	/*float view() //���ϰ��� Ÿ���� �޼��� �̸� ���� ����.
	{
		int a=20;//
		System.out.println("view method!");//
		return 10.2f;//
	}*/
	
	/*int[] view1() //���ϰ��� Ÿ���� �޼��� �̸� ���� ����.
	{
		int a=20;//
		System.out.println("view method!");//
		return new int [3];//
	}*/
	int view1() //���ϰ��� Ÿ���� �޼��� �̸� ���� ����.
	{
		//int a=20;//
		System.out.println("view method!");//
		int kor=10;
		return kor;//
	}
}
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Method1 ins=new Method1(); //Ŭ������ ��ü ����
  ins.prt();                              //�޼��� ȣ��
 // ins.view1();
  int result=ins.view1();//���� ���� int ������ �����Ѵ�.
  System.out.println(result);
	}

}
