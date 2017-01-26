package kic.exception;
class UserException extends Exception //사용자 exception
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
		/*try{//예외 처리 스스로 함


			if(age >24)
				throw new UserException("웃자");
			else
				System.out.println("^^");
		}catch(UserException e)
		{
			System.out.println(e);
		}*/
		if(age>24)
			throw new UserException("웃자");
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
		//예외 처리 메인에서 함

	}

}
