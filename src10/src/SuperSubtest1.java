
class Ani//�θ�����
{
	public void see()
	{
		System.out.println("����.");
	}
	public void run()
	{
		System.out.println("�޸���.");
	}
}//�θ�Ŭ���� super_class


class Dog extends Ani//extends Ani�θ�Ŭ������ Ȯ��  �ϳ��� �� �� �ִ�.
{
	public void sound()
	{
		System.out.println("RRR~RR!");
		
	}
	public void doing()
	{
		System.out.println("����");
	}
}//�ڽ�Ŭ���� sub_class
public class SuperSubtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ani ins = new Ani();   
		Dog ins2 = new Dog();
		ins.see();
		ins.run();
		System.out.println("----");
		ins2.see();
		ins2.run();
		ins2.doing();
		ins2.sound();
		
		Ani ins3=new Dog();//??//Dog �޼��尡 Ani�޼��忡 Ȯ��Ҽ� �Ǿ��־ ��ü�� ������ �� �ִ�? ������� �������ٰ� extends Ani�� �޸𸮿��ִ���
		//Dog ins4=new Ani();//??//Dog���� Ani��ü�� ����.
		ins3.run();
		ins3.see();
		//ins3.sound();
		Dog ins4= (Dog)new Ani();//Exception in thread "main" java.lang.ClassCastException: Ani cannot be cast to Dog at SuperSubtest1.main(SuperSubtest1.java:46)
		                                      //���� ����ȯ �ϸ� �ȵȴ�.

		

	}

}
