class St2
{
	private static final int su;//로딩될때 초기화시키는방법
	//private static final int su=10; 그리고 static에 초기화 할수 있음
	static
	{
		su=20;
	 System.out.println("Static초기화블록");
	}
	{
		System.out.println("초기화블록");
		
	}
	
	public St2()
	{
		System.out.println("생성자");
	}
}


public class Static2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 St2 ins = new St2();
 St2 ins2 =new St2();
	}

}
