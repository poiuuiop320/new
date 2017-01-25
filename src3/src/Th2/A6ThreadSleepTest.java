package Th2;
class Job1 implements Runnable
{

	private String str;
	public Job1(String str) 
	{

		this.str=str;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try{
				Thread.sleep(400);//스레드 동작시 0.4초 슬립
			}
			catch(InterruptedException e){System.out.println(e);}
			System.out.println(str+":"+i);
		}
	}
	
}
public class A6ThreadSleepTest {

	public static void main(String[] args) {
		Job1 ins=new Job1("first");
		Job1 ins2=new Job1("second");
		
		Thread th1=new Thread (ins);
		Thread th2=new Thread(ins2);
		th1.start();
		th2.start();

/* 골고루 작업
 //순서가 보장 안됨*/

	}

}
