class Ani1
{
	public void see()
	{
		System.out.println("본다");
	}
	public void sound()
	{
		System.out.println("hahaha");
	}
}
class Mon extends Ani1
{
	public void like()
	{
		System.out.println("바나나를 좋아한다.");
	}
}
class Dog extends Ani1
{
	public void sound()
	{
		System.out.println("RRR~RR!!");
	}
	public void doing()
	{
		System.out.println("화남");
	}
}
public class A2overridetest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Mon ins= new Mon();
            ins.like();
            ins.see();
            ins.sound();
            System.out.println("----");
            Dog ins2 =new Dog();
            ins2.sound();
            ins2.see();
            ins2.doing();
            
	}

}
