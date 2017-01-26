public class Acc1
{
	private String name;
	private int age;
	
	public String getName()  //getter and setter
	{ 
		
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Acc1(String name)
	{
		this.name=name;
	}
	public void prt()
	{
		System.out.println(name);
	}
}

