class This1
{
	private String name;
	private int age;
	private String addr;
	private String gen;
	public This1(String name)
	{
		this.name=name;
	}
	public This1(String name,int age)
	{
		//this.this1.name 반복되는걸 위에있는걸 활용
		this(name);
		this.age=age;
	}
	public This1(String name,int age, String addr)
	{
		/*this.name=name;
		this.age=age;*/
		this(name,age);
		this.addr=addr;
		
	}
	public This1(String name,int age, String addr, String gen)
	{
		/*this.name=name;
		this.age=age;
		this.addr=addr;*/
		this(name,age,addr);
		this.gen=gen;
	}
	public void prt()
	{
		System.out.printf("%s%d%s%s",name,age,addr,gen);//print 주의
	}
}
public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       This1 ins = new This1("rrr",20,"seoul","Men");//객체를 생성하고 매개변수를 사용호출
       ins.prt();//새로운 변수 객체안에 This1객체안에 생성자 객체를 사용
	}

}
