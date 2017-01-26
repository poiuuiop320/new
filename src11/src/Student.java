public class Student {

	private String name;
	private int age;
	Student(String name) //생성자 만듦.
	{
		this.name=name; //인스턴스 초기화
	}  
	Student(String n,int a)//생성자 오버로딩1
	{
		/*this.name=name;  //this Student 클래스의 변수로 인식하려면 this를 사용해야함
		this.age=age; //인스턴스 초기화 
*/	}
	Student()//생성자 오버로딩2
	{
		
	}
	void prt() //메서드
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
