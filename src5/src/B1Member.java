import java.io.Serializable;

public class B1Member implements Serializable {
private static final long serialVersionUDI = 1;
	private String name;
//	  private transient int age;
//	private static int age;
	private int age;
	
	private String addr;

	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public B1Member(String name, int age,String addr)
	  {
		  this.name=name;
		  this.age=age;
		  this.addr=addr;
	  }
	  public void prt()
	  {
		  System.out.println("prt!!!");
	  }
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
