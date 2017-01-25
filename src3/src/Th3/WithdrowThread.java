package Th3;

public class WithdrowThread implements Runnable 
{
	private Bank bank;
	private Account acc; 
	public WithdrowThread(Bank bank)
	{
		this.bank=bank;

	}
	
	WithdrowThread(Account acc) {

		this.acc=acc;
	}

	@Override
	public void run() {

		try{
			for (int i = 0; i < 10; i++) {

				Thread.sleep(300);
				bank.widthdraw();

			}
		}catch(InterruptedException e){
			System.out.println(e);
		}

	}

}
