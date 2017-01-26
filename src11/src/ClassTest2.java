class Person1{
	 String name;
	 int age;
	//똑같은이름을사용한다.
	
	Person1(String n, int a)//생성자(Constructor )
	{
		name=n;
		age=a;
	}
}
public class ClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Person1 ins = new Person1(); //객체 생성
 //        ins : class 를가르키는 참조변수임
 //ins.name="honghong";//인스턴스 변수
 //ins.age=22;
  
    Person1 ins2 = new Person1("홍길동",10);//생성자를 이용
    System.out.println(ins2.name);
    System.out.println(ins2.age);
	}

}
