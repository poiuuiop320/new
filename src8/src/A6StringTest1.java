
public class A6StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hong";//string 클래스형
		String name2="hong";
		String name3=new String(new char[]{'h','o','n','g'});
		String name4= new String("hong");
		System.out.println(name==name2);//참조변수비교
		System.out.println(name==name3);
		System.out.println("=====");
		System.out.println(name.equals(name2));//객체안 객체값을 비교
		System.out.println(name.equals(name3));
		
	}

}
