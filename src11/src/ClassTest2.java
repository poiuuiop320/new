class Person1{
	 String name;
	 int age;
	//�Ȱ����̸�������Ѵ�.
	
	Person1(String n, int a)//������(Constructor )
	{
		name=n;
		age=a;
	}
}
public class ClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Person1 ins = new Person1(); //��ü ����
 //        ins : class ������Ű�� ����������
 //ins.name="honghong";//�ν��Ͻ� ����
 //ins.age=22;
  
    Person1 ins2 = new Person1("ȫ�浿",10);//�����ڸ� �̿�
    System.out.println(ins2.name);
    System.out.println(ins2.age);
	}

}
