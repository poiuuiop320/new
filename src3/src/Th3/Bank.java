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
				System.out.println("100�� ����"+acc.money);
			}
			else
				System.out.println("�ܰ����"+acc.money);
	
		}
		
	}
	public /*synchronized */void depiosit()
	{
		synchronized(acc)//�޼��� �� �Ǵ� �ȿ� ���� ����.
		{
			acc.money+=100;
			System.out.println("100�� �Ա�"+acc.money);
		
		}
		}
}
