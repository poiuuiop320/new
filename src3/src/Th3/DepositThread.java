package Th3;

public class DepositThread implements Runnable{
	private Bank bank;
	private Account acc;
	DepositThread(Bank bank)
	{
		this.bank=bank;
	}
	
	DepositThread(Account acc) {

		this.acc=acc;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for (int i = 0; i < 10; i++) {

				Thread.sleep(300);
				bank.depiosit();
			}

		}catch(InterruptedException e){
			System.out.println(e);
		}
	}


}
