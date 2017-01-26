//private :클래스내에서만 접근
//public : 전체공개
public class Acc11 {
    private String name;
    private int age;
      
   public String getName() {  //getter and setter
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
    public Acc11(String name)
   {
	   this.name=name;
   }
    public void prt()
    {
    	System.out.println("name:"+name);
    }
	
}
