class Ref1
{
	int su = 10;
}
public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 ins1 = new Ref1();
		Ref1 ins2 = new Ref1();
		System.out.println(ins1==ins2);//==equals �� ��ü�� ��..���:False
		System.out.println(ins1.equals(ins2));                                 // False
		System.out.println("======");
		System.out.println(ins1.su==ins2.su);                                //True
		System.out.println("======");//=���� �� ==��ü�� ��ü�� ��ü�� ��
		Ref1 ins3 =ins1;                                          //����Ų��.                           
		System.out.println(ins1==ins3);                 //����Ų���� ��ü�� =����������  equals ��ü�鿡 ���� ����.
		System.out.println(ins1.equals(ins3));
		System.out.println("======");
		

	}

}
