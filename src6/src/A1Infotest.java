import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class A1Infotest {

	public static void main(String[] args)  throws Exception{
		//ArrayList<Info> arr=new ArrayList<>();//�̰Ÿ� �����;��Ѵ�. 

		ArrayList<A1Info> arr=new ArrayList<>();
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true)//while
		{
			A1Info ins=new A1Info();//�ȿ� �ۼ��ؾ� ���ο� ��ü�� ���� ����.
			System.out.println("input name");
			String name=in.readLine();
			System.out.println("input age");
			int age=Integer.parseInt(in.readLine());
			ins.setName(name);
			ins.setAge(age);

			arr.add(ins);
			System.out.println("countinue?");
			String yn=in.readLine();
			if(yn.equalsIgnoreCase("n"))
			break;
		}  //while
/*		for (A1Info index : arr) 
		{
			System.out.printf("%s\t%d\n ",index.getName(),index.getAge());

		}���� for��
		*/
		/*for (int i = 0; i < arr.size(); i++) {
			A1Info index=arr.get(i);
			System.out.printf("%s\t%d\n",index.getName(),index.getAge());
		}*/
		Iterator<A1Info> ita=arr.iterator();
		while(ita.hasNext())
		{
			A1Info index=ita.next();
			System.out.printf("%s\t%d\n",index.getName(),index.getAge());
		}
		

		//for������ get iterator�� ����Ҽ��ִ�

	}  //main

}  //class
