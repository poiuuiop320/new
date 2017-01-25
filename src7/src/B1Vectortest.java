import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
//http://docs.oracle.com/javase/7/docs/api/java/util/Vector.html
public class B1Vectortest {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("aaa");
		v.add("bbb");
		v.add(new Date());
		v.add(10.2);
		v.add(10);
		v.add(new Double(10.2));
		v.add(new Integer(20));
		
		System.out.println(v);
		System.out.println(v.elementAt(2));
		System.out.println(v.size());
		System.out.println(v.elementAt(5));
		System.out.println(v.get(6));//get도 사용 가능하다.
		/*for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
			
		}*/
		  
				/*  for(int i=0; i<v.size(); i++)
					  System.out.println(v.elementAt(i));*/
				  
				  /*
				  for(int i=0; i<v.size(); i++)
					  System.out.println(v.get(i));//arraylist 비동기처리
				  */
				  //http://docs.oracle.com/javase/7/docs/api/java/util/Enumeration.html
				/*  Enumeration enu=v.elements(); //동기처리
				  while(enu.hasMoreElements())   
					   System.out.println(enu.nextElement());*/
				  
				 
				  Iterator ita=v.iterator();//리스트 비동기처리
				  while(ita.hasNext())
					  System.out.println(ita.next()); //자료를 받아오는 여러가지 방법.메서드()로 받아옴
		
	

	}

}
