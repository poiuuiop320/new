package kic.exception;
class UserException extends Exception //����� exception
{
	public UserException(String msg)
	{
		super(msg);
	}
}
class actionDoing
{
	public void smile(int age)throws UserException
	{
		/*try{//���� ó�� ������ ��


			if(age >24)
				throw new UserException("����");
			else
				System.out.println("^^");
		}catch(UserException e)
		{
			System.out.println(e);
		}*/
		if(age>24)
			throw new UserException("����");
		else
			System.out.println("^^");
	}
}
public class Exception6 {

	public static void main(String[] args)/*throws UserException */{
		actionDoing ins = new actionDoing();
		//		ins.smile(25);
		try{
			ins.smile(25);
		}catch(UserException e)
		{
			System.out.println(e);
		}
		//���� ó�� ���ο��� ��

	}

}
