class Man
{
	private String name;
	private int age;
	public Man()
	{
		System.out.println("Man Constructor");
	}
	public Man(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("ddd");
	}
	public Man(String name)
	{
		this.name=name;
	}
}
class Student extends Man
{
	private String Hak;
	private String stcode;
	public Student()//no-argument Constructor
	{
		super();//부모의 생성자를 호출한다.//매개변수가 없다.보통 생략되어있음
		System.out.println("Student Constuctor");
	}
	
}
public class B1SuperTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ins = new Student();
		

	}

}
