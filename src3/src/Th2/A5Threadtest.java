package Th2;
class Job extends Thread
{
	public Job(String str)
	{
		super(str);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}
}
public class A5Threadtest {

	public static void main(String[] args) {
		Job j1=new Job("첫번째");
		Job j2=new Job("두번째");
		Job j3=new Job("세번째");

		j1.setPriority(Thread.NORM_PRIORITY);//우선순위
		j2.setPriority(Thread.MAX_PRIORITY);
		j3.setPriority(Thread.MIN_PRIORITY);
	
		j1.start();
		j2.start();
		j3.start();
	
		
		
	}

}
//wait()  : notify()
