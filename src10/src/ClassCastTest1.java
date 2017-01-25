class Ani2
{
	public void prt(){System.out.println("ani2 prt!!");}
}
class Dog2 extends Ani2
{
	public void view()	{System.out.println("view");}
}
public class ClassCastTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ani2 ins=new Dog2();
		Ani2 ins = new Dog2();
	    Dog2 ins2 = (Dog2)ins;
	    ins2.prt();
	    ins2.view();
	    //Dog2 ins3 =(Dog2)new Ani2();//Exception in thread "main" view java.lang.ClassCastException: Ani2 cannot be cast to Dog2 at ClassCastTest1.main(ClassCastTest1.java:18)

	    Ani2 ins3=new Ani2();
	    		System.out.println(ins instanceof Dog2);
		System.out.println(ins2 instanceof Dog2); //해당 객체가 뒤에걸로 바꿀때 괜찬은지 여부
		


	}

}
