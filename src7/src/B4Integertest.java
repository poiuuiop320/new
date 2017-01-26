import java.util.Vector;

public class B4Integertest {

	public static void main(String[] args) {
		  Vector v=new Vector();
	         /*
	         v.add(new Integer(10));
	         v.add(new Integer(20));
	         v.add(new Integer(30));*/
	         
	         v.add(10);  //jdk5 auto-boxing
	         v.add(20);
	         v.add(30);
	         
	       /*  int tot=0;
	         for(int i=0; i<v.size(); i++)
	         {
	        	 tot+=((Integer)v.get(i)).intValue();
	         }*/
	         
	         int tot=0;
	         for(int i=0; i<v.size(); i++)
	         {
	        	 tot+=(Integer)v.get(i);  //auto-unboxing
	         }
	         
	         
	         
	         System.out.println(tot);
	}

}
