import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class B8HashTabletest {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht =new Hashtable<>();
		ht.put("a1", 100);//new Integer(100)컬렉션 정보로 객체가 들어간다. 
		ht.put("a2", 200);//박싱
		ht.put("a3", 100);//buckets
		/*Integer one = ht.get("a1");
	System.out.println(one);//언박싱*/
		/*Enumeration<String>enu=ht.keys();
	while(enu.hasMoreElements())
	{
		String key = enu.nextElement();
		Integer value=ht.get(key);
		System.out.println(key+","+value);//
	}*/
		Iterator<String>ita = ht.keySet().iterator();
		while(ita.hasNext())
		{
			String key=ita.next();
			Integer value = ht.get(key);
			System.out.println(key+","+value);
		}
	}

}
