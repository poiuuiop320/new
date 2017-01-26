import java.util.Date;

public class A3Datetest {

	public static void main(String[] args) {
	Date d=new Date();
	int d1=d.getDate();
	int d2=d.getDay();
	System.out.println(d1);
	System.out.println(d2);
	int y=d.getYear();
	System.out.println(y+1900);

	}

}
