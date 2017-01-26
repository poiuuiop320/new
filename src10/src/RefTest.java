class Ref1
{
	int su = 10;
}
public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 ins1 = new Ref1();
		Ref1 ins2 = new Ref1();
		System.out.println(ins1==ins2);//==equals 로 객체를 비교..결과:False
		System.out.println(ins1.equals(ins2));                                 // False
		System.out.println("======");
		System.out.println(ins1.su==ins2.su);                                //True
		System.out.println("======");//=값을 비교 ==객체와 객체와 객체를 비교
		Ref1 ins3 =ins1;                                          //가리킨다.                           
		System.out.println(ins1==ins3);                 //가리킨것을 객체비교 =참조변수값  equals 객체들에 대한 정보.
		System.out.println(ins1.equals(ins3));
		System.out.println("======");
		

	}

}
