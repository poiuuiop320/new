import java.util.Hashtable;
import java.util.Iterator;

class Name
{
	private String firstname;
	private String lastname;
	public Name(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
	}
	@Override
	public String toString() {//보낼때 toString 을 사용하도록한다.
		return firstname +  lastname;
	}

	
}
public class A3HtTest {

	public static void main(String[] args) {
		Hashtable<String, Name> ht=new Hashtable<>();//name 클래스도 받고 String 도받고 Integer받을 수 있다.
		ht.put("a1", new Name("홍","길동"));//put으로 값을 넣을때 객체 생성하며 값을 넣을수 있다.
		ht.put("a2", new Name("김","지연"));//name
		ht.put("a3", new Name("허","수진"));
		
		Iterator<String> ita=ht.keySet().iterator();//hashtable 은 인터페이스iterator 사용할 수 있고 hasnext를 이용해서 출력 
		while(ita.hasNext())
		{
			String key=ita.next();//String 안에 key 값을 가져올수있고 저장한다.
			Name n=ht.get(key);//name의 참조변수 안에 get 으로 key 값을 가져온다
			System.out.println(n+key); //출력한다.
			
		}
	
	}

}
