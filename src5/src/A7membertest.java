import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A7membertest {

	public static void main(String[] args) 
	{
		A7memberaction act= new A7memberaction();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� �̸��� �Է��ϼ���");
		try {
			String fname = in.readLine();
			System.out.println("input name");
			String name = in.readLine();
			System.out.println("input age");
			int age=Integer.parseInt(in.readLine());
			act.memberAppend(fname,name,age);
		} catch (IOException e) {
			System.out.println("���� �̸� �ٽ� �Է�");

		}
	}

}
