package Th3;

public class Account {
	public int money;
	public Account (int money)
	{

	}



}
//객체단위, 메서드단위 동기화 할수있음.
//임계영역 여러 메서드가 같이 갖고있는 공유자원
//동기화 많은 접근이 있을 때 하나만 접근하고 나머지는 차단,접근하지않게처리