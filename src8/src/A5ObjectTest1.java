class AObject1 //모든클래스는 object 상속받는다
{ 
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "AObject1 [name=" + name + ", age=" + age + "]";
	}

	public AObject1(String name, int age)
	{
		super();
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode() {//equals 는 hashCode랑 같이 써야한다.
		// TODO Auto-generated method stub
		return this.name.hashCode()+this.age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof AObject1)
		{
			AObject1 ins = (AObject1)obj;//형변환해서 
			if(this.name.equals(ins.name)&&this.age==ins.age)
				return true;
			else
				return false;
		} 
		
			else
				return false;
		}
		
		//return super.equals(obj);// obj로 받음
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class A5ObjectTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AObject1 ins = new AObject1 ("hone",20);
AObject1 ins2 = new AObject1("hong",20);
System.out.println(ins==ins2);//
System.out.println(ins.equals(ins2));
System.out.println("-------");
System.out.println(ins.toString()); //객체에대한것을 문자화한것임 //객체 출력
System.out.println(ins);
System.out.println(ins2.toString());
System.out.println(ins2);

	}

}
