package kic.exception;
class User
{
	public int div(int su, int su2)
	{
		return su/su2;
	}
}
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User ins = new User();
		int result = ins.div(10, 0);
		System.out.println(result);// java.lang.ArithmeticException: / by zero

	}

}
