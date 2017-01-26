class This3
{
	private String name;
	private int age;
	private String addr;
	public This3(String name,int age,String addr)
	{
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	public This3(String name)//기본 리턴 값을 지정한 생성자를 활용할 수 있다.
	{
		this(name,0,"서울");
	}
	public String prt()
	{
		return "name:"+name+",age:"+age+",addr:"+addr;
	}
}
public class ThisTest3 {

	public static void main(String[] args) {
		
		This3 ins = new This3("김하나");//하나의 매개변수만 넘김
        System.out.println(ins.prt());//저장되지않고 바로 값을 받을 수 있음
	}

}
