import java.util.Calendar;

public class A3Calendar {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		int y=c.get(Calendar.YEAR);
		int m=c.get(Calendar.MONTH)+1;
		int m2=c.get(Calendar.DAY_OF_MONTH);
		int m3=c.get(Calendar.WEEK_OF_MONTH);
		int d=c.get(Calendar.DAY_OF_YEAR);
		System.out.println(y);
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(d);
		
	

	}

}
