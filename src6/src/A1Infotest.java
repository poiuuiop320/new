import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class A1Infotest {

	public static void main(String[] args)  throws Exception{
		//ArrayList<Info> arr=new ArrayList<>();//이거를 가져와야한다. 

		ArrayList<A1Info> arr=new ArrayList<>();
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		while(true)//while
		{
			A1Info ins=new A1Info();//안에 작성해야 새로운 객체에 값이 들어간다.
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

		}향상된 for문
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
		

		//for문으로 get iterator로 사용할수있다

	}  //main

}  //class
