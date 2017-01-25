package Th3;

public class Bank {
	private Account acc;
	public Bank(Account acc)
	{
		this.acc=acc;
	}
	public /*synchronized*/ void widthdraw()
	{
		synchronized (acc)
		{
			if(acc.money>=100)
			{

				acc.money-=100;
				System.out.println("100원 인출"+acc.money);
			}
			else
				System.out.println("잔고부족"+acc.money);
	
		}
		
	}
	public /*synchronized */void depiosit()
	{
		synchronized(acc)//메서드 앞 또는 안에 할일 쓴다.
		{
			acc.money+=100;
			System.out.println("100원 입급"+acc.money);
		
		}
		}
}
