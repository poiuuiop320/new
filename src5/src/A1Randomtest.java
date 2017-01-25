import java.util.Random;

public class A1Randomtest {

	public static void main(String[] args)
	{
		//		for (int i = 0; i < 10; i++) {

		//System.out.println(Math.random());
		//			int su =(int)(Math.random()*9);
		//			int su =(int)(Math.random()*3)+1;
		//			System.out.println(su);}
		Random rnd= new Random(System.currentTimeMillis());
		//Random rnd1= new Random();
		for (int i = 0; i < 3; i++) {
			System.out.println(rnd.nextInt(9));//*3+1 ¿Í °°À½
			
		}



	}

}
