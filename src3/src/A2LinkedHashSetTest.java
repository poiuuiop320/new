import java.util.Iterator;
import java.util.LinkedHashSet;

public class A2LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String>s=new LinkedHashSet<>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("a");
		//		System.out.println(s);
		Iterator<String> ita=s.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		

	}

}
