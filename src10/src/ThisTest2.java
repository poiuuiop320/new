class This2
{
 public This2()
 {
	 System.out.println("no-arg constructor");
 }
 public This2(String name)
 {
	 this();//항상 처음에 작성해야한다.
	 System.out.println("name-agr constructor");
	 //this();//항상 처음에 작성해야한다. error
 }
 public This2(String name,int age)
 {
	 this(name);//
	 System.out.println("name-age-arg constructor");
	 
 }
 
}
public class ThisTest2 {

	public static void main(String[] args) 
	{

     This2 ins = new This2 ("kim",22);
     
     
	}

}
