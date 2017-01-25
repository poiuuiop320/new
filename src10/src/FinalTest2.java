/*fiinal 멤버변수
 * 생성자를 이용해서 final 변수를 사용할 수 있다. 초기화 할수 있다.
*/
class Final2
{
	public final int su=10;//public final int su;;//The blank final field su may not have been initialized
	public final int su2;
	public Final2(int su2)
	{
		this.su2=su2;
	}//객체가 생성 됬을때 메모리가 지정 할당 되어 서 생성자로 다룰수 있다.
}
public class FinalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final2 ins = new Final2(20);
		Final2 ins2 = new Final2(30);
		System.out.println(ins.su);  //지정된값
		System.out.println(ins2.su); //지정된값
		System.out.println(ins.su2); //20 ins객체를 위에서 만들었을때 생성자를 이용해서 값을 (매개변수를)사용했다.그값을 출력
		System.out.println(ins2.su2);//30 
		   //ins2.su2+=30;///int su=10;su+=30; su=su+30;
		//ins2.su2=ins2.su2+30 //
	
	}

}
