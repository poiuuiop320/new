package Th3;

public class Banktest {

	public static void main(String[] args) {
		Bank b= new Bank(new Account(0));
		WithdrowThread job1 = new WithdrowThread(b);
		DepositThread job2=new DepositThread(b);
		Thread th1 =new Thread(job1);
		Thread th2=new Thread (job2);
		th1.start();
		th2.start();





	}

}
