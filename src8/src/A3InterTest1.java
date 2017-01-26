interface Inter_1 //public abstract 안에 있는것이다.생략됨

{
	//생성자 안됨
	int su = 10;//public static final 변수임 (인터페이스는)
	void prt();//public abstract method //접근제한자 지정예약어가 생략됨 자료가... 
	//public void prt();
	//초기화블럭도 안됨
	
}
class Inter_class1 implements Inter_1
{
	public String name="hong";//name에 접근하려면 생성자를 만들어서 접근해야한다.
	public void prt(){
		System.out.println("prt!");
	}
}
public class A3InterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
