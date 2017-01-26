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
	public String toString() {//������ toString �� ����ϵ����Ѵ�.
		return firstname +  lastname;
	}

	
}
public class A3HtTest {

	public static void main(String[] args) {
		Hashtable<String, Name> ht=new Hashtable<>();//name Ŭ������ �ް� String ���ް� Integer���� �� �ִ�.
		ht.put("a1", new Name("ȫ","�浿"));//put���� ���� ������ ��ü �����ϸ� ���� ������ �ִ�.
		ht.put("a2", new Name("��","����"));//name
		ht.put("a3", new Name("��","����"));
		
		Iterator<String> ita=ht.keySet().iterator();//hashtable �� �������̽�iterator ����� �� �ְ� hasnext�� �̿��ؼ� ��� 
		while(ita.hasNext())
		{
			String key=ita.next();//String �ȿ� key ���� �����ü��ְ� �����Ѵ�.
			Name n=ht.get(key);//name�� �������� �ȿ� get ���� key ���� �����´�
			System.out.println(n+key); //����Ѵ�.
			
		}
	
	}

}
