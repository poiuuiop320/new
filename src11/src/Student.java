public class Student {

	private String name;
	private int age;
	Student(String name) //������ ����.
	{
		this.name=name; //�ν��Ͻ� �ʱ�ȭ
	}  
	Student(String n,int a)//������ �����ε�1
	{
		/*this.name=name;  //this Student Ŭ������ ������ �ν��Ϸ��� this�� ����ؾ���
		this.age=age; //�ν��Ͻ� �ʱ�ȭ 
*/	}
	Student()//������ �����ε�2
	{
		
	}
	void prt() //�޼���
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
