import java.util.HashSet;
import java.util.Iterator;

public class A4Settest {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);//new Integer(10) Auto Boxi
		hs.add(20);
		hs.add(10);
		hs.add(20);
		hs.add(50);
		hs.add(30);
		System.out.println(hs.size());
		Iterator<Integer>ita=hs.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		System.out.println(hs.isEmpty());
		hs.remove(50);
		System.out.println(hs.size());
		hs.clear();
		System.out.println(hs.size());
		System.out.println(hs.isEmpty()); 


	}

}
