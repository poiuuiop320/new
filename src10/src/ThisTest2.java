class This2
{
 public This2()
 {
	 System.out.println("no-arg constructor");
 }
 public This2(String name)
 {
	 this();//�׻� ó���� �ۼ��ؾ��Ѵ�.
	 System.out.println("name-agr constructor");
	 //this();//�׻� ó���� �ۼ��ؾ��Ѵ�. error
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
