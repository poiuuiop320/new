class St2
{
	private static final int su;//�ε��ɶ� �ʱ�ȭ��Ű�¹��
	//private static final int su=10; �׸��� static�� �ʱ�ȭ �Ҽ� ����
	static
	{
		su=20;
	 System.out.println("Static�ʱ�ȭ���");
	}
	{
		System.out.println("�ʱ�ȭ���");
		
	}
	
	public St2()
	{
		System.out.println("������");
	}
}


public class Static2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 St2 ins = new St2();
 St2 ins2 =new St2();
	}

}
