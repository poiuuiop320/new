import java.util.Hashtable;
import java.util.Iterator;

public class A2HtTest {

	public static void main(String[] args) {
		Hashtable<String, Integer>ht = new Hashtable<>();
		ht.put("a1", 10);
	      ht.put("a2", 20);
	      ht.put("a3", 30);
	      ht.put("a4",40);
	      ht.put("a3",	20);
	     /* Set<String> s=ht.keySet();
	        Iterator<String> ita=s.iterator();*/
	       Iterator<String>  ita= ht.keySet().iterator();//iterator 호출    ht.keyset()은 위에 해쉬테이블
	        while(ita.hasNext())
	        {
	          String key=ita.next();
	          Integer data=    ht.get(key);
	          System.out.println(key+", "+data);
	        }
	}

}
