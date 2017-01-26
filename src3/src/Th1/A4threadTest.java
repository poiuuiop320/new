package Th1;
class Job2 implements Runnable //1첫번째 쓰레트 상속 두번째 러너블인터페이스상속
{
private String name;

	public Job2(String name) {
	
	this.name = name;
}
public Job2(){}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(name+":"+i);
		}
	}
	
}
public class A4threadTest {

	public static void main(String[] args) {
	Job2 ins=new Job2("쓰레드1");
	Thread th1 = new Thread(ins);//스레드에 올림.
	th1.start();
//	Job2 ins2=new Job2("tttt:2");
	Job2 ins2=new Job2();//이름 없이 부여할 수 있다.//null값이 나옴
	Thread th2 = new Thread(ins2,"th2");
	th2.start();
	
	}

}
//쓰레드 클래스를 상속받아 사용할수있다.
//러너블 인터페이스 상속받아 사용할수있다./.