
class Ani//부모정보
{
	public void see()
	{
		System.out.println("본다.");
	}
	public void run()
	{
		System.out.println("달린다.");
	}
}//부모클래스 super_class


class Dog extends Ani//extends Ani부모클래스에 확장  하나만 쓸 수 있다.
{
	public void sound()
	{
		System.out.println("RRR~RR!");
		
	}
	public void doing()
	{
		System.out.println("문다");
	}
}//자식클래스 sub_class
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
		
		Ani ins3=new Dog();//??//Dog 메서드가 Ani메서드에 확장소속 되어있어서 객체를 생성할 수 있다? 순서대로 내려오다가 extends Ani가 메모리에있는지
		//Dog ins4=new Ani();//??//Dog에서 Ani객체가 없다.
		ins3.run();
		ins3.see();
		//ins3.sound();
		Dog ins4= (Dog)new Ani();//Exception in thread "main" java.lang.ClassCastException: Ani cannot be cast to Dog at SuperSubtest1.main(SuperSubtest1.java:46)
		                                      //강제 형변환 하면 안된다.

		

	}

}
