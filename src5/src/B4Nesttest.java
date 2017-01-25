

class Sungjuck
{
	private int kor;
	private int eng;
	private int math;
	public Sungjuck(int kor, int eng, int math)
	{
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public String toString() {
		return "Sungjuck [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
    public void prt()
    {
    	System.out.println("prt!!!");
    }
}
class Student
{
	  private String stcode; //학번
	  private String name;
	  private Sungjuck s;
	  public Student(String stcode, String name, Sungjuck s) //is a(상속관계)     has a(포함관계)
	  {
		  this.stcode=stcode;
		  this.name=name;
		  this.s=s;
	  }
	  public void view()
	  {
		  System.out.println(stcode);
		  System.out.println(name);
		  System.out.println(s);
		  s.prt();
	  }
	  
	  
}

public class B4Nesttest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s1=new Student("111","hong",new Sungjuck(100, 100, 100));
      Student s2=new Student("222", "kim", new Sungjuck(90, 90, 90));
      s1.view();
      s2.view();
	}

}