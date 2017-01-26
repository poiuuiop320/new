import java.util.Vector;

public class A4Vectortest {

	public static void main(String[] args) {
		Vector v = new Vector();//그 크기만큼 키움/add/증가
		Vector v2= new Vector(3);
		Vector v3= new Vector(3,4);

		for (int i = 0; i <=10 ; i++) {
			v.add(i+"");
			v2.add(i+"");
			v3.add(i+"");
 
		}
		System.out.println(v.capacity()+","+v.size());
		System.out.println(v2.capacity()+","+v2.size());
		System.out.println(v3.capacity()+","+v3.size());


	}

}
