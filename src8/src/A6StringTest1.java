
public class A6StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hong";//string Ŭ������
		String name2="hong";
		String name3=new String(new char[]{'h','o','n','g'});
		String name4= new String("hong");
		System.out.println(name==name2);//����������
		System.out.println(name==name3);
		System.out.println("=====");
		System.out.println(name.equals(name2));//��ü�� ��ü���� ��
		System.out.println(name.equals(name3));
		
	}

}
