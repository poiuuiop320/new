import java.util.Iterator;
import java.util.Vector;

public class B5Vectortest {

	public static void main(String[] args) {
		
		 /*  Vector v=new Vector();
		   v.add("hong");
		   v.add(123);
		   v.add(20.2);
		   
	         String name=(String)    v.get(0);		
			 int age=(Integer)v.get(1);
			 double avg=(Double) v.get(2);
		*/
			
			Vector<String> v=new Vector<>(); //generic 반드시 제네릭써서 프로그램구현해야함 제네릭은5버전 생략은 7버전
			  v.add("hong");
			  v.add("kim");
			  //v.add(10);
			  v.add("park");
			   Iterator<String> ita=v.iterator(); 
	                while(ita.hasNext())
	                {
	                	String item=ita.next();
	                	System.out.println(item);
	                }
	                System.out.println("==============");
	            for(int i=0; i<v.size(); i++)
	            {
	            	String item=v.get(i);//형변환 할 필요가 없이.
	            	System.out.println(item);
	            }

	}

}
