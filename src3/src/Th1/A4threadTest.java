package Th1;
class Job2 implements Runnable //1ù��° ����Ʈ ��� �ι�° ���ʺ��������̽����
{
private String name;

	public Job2(String name) {
	
	this.name = name;
}
public Job2(){}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}
public class A4threadTest {

	public static void main(String[] args) {
	Job2 ins=new Job2("������1");
	Thread th1 = new Thread(ins);//�����忡 �ø�.
	th1.start();
//	Job2 ins2=new Job2("tttt:2");
	Job2 ins2=new Job2();//�̸� ���� �ο��� �� �ִ�.//null���� ����
	Thread th2 = new Thread(ins2,"th2");
	th2.start();
	
	}

}
//������ Ŭ������ ��ӹ޾� ����Ҽ��ִ�.
//���ʺ� �������̽� ��ӹ޾� ����Ҽ��ִ�./.