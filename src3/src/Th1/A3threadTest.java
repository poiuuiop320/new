package Th1;
class Job1 extends Thread//extends Thread
{
	public Job1(String str)
	{
		super(str);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+":"+i);
			
		}
	}
}
public class A3threadTest {

	public static void main(String[] args) {
	Job1 ins= new Job1("작업1");
	Job1 ins2= new Job1("작업2");
	ins.start();
	for (int i = 0; i < 10; i++) {
		System.out.println("main-thread");
		try{
			Thread.sleep(300);
			
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
	//호출하는 순간 동작
	ins2.start();

	}

}
