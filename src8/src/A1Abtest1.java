abstract class  Dog //�߻�Ŭ���� ��ü�� �ȸ���� �ش��ڷ�� Ŭ���������� ����ȭ�� ���ָ� ����°� ��ü�� �ȸ��鶧 ���
{
	int age; //�ν��Ͻ����� �� �����ڸ� ������ְ� ��ӹ����ڽĿ��� �����ڸ� ����� ��� �Ѵ�.
	public static String name;//�Ϲݺ����� �����ϴ�
	public Dog(int age)//  
	{
		this.age=age;
	}
	public void eat() //�Ϲ� �޼��嵵 �����ϴ�
	{
		System.out.println("�߻� ������");
	}
public abstract void shape();//�߻�޼��� �����̾��� �޼��� //���𵿽ÿ� �޼��带 �������� //����ȭ�� �޼���
 }
class Poodle extends Dog
{

	public Poodle(int age) {
		super(age);//
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
	}

}
public class A1Abtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Ab1 ins = new Ab1(); //Cannot instantiate the type Ab1 ��Ÿ������ ��ü����� ����.
	//Dog ins = new Dog();//��������
		//Poodle p1 = new Poodle();//
		Poodle p2 =new Poodle(5);
	}

}
