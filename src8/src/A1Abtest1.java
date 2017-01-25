abstract class  Dog //추상클래스 객체를 안만들고 해당자료들 클래스내에서 공통화된 범주를 만드는것 객체를 안만들때 사용
{
	int age; //인스턴스변수 나 생성자를 만들수있고 상속받은자식에서 생성자를 만들어 줘야 한다.
	public static String name;//일반변수도 가능하다
	public Dog(int age)//  
	{
		this.age=age;
	}
	public void eat() //일반 메서드도 가능하다
	{
		System.out.println("닭뼈 ㄴㄴㄴ");
	}
public abstract void shape();//추상메서드 몸통이없는 메서드 //선언동시에 메서드를 만들어야함 //강제화로 메서드
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
		System.out.println("털이 꼬불");
	}

}
public class A1Abtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Ab1 ins = new Ab1(); //Cannot instantiate the type Ab1 이타입으로 객체만들수 없다.
	//Dog ins = new Dog();//마찬가지
		//Poodle p1 = new Poodle();//
		Poodle p2 =new Poodle(5);
	}

}
