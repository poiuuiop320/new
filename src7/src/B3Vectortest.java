import java.util.Vector;

public class B3Vectortest {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add("ddd");
		v.add("eeee");
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));//����� ���� ���� v���������� �ߺ����� �������°� �� �� �ִ�.
			
		}
		v.remove(0);//remove�޼��带 �̿��ؼ� 0����
		System.out.println(v.get(0));//0��°�� Ȯ���ϴ� �ι�°�� ������ ���� �Ű���
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
			
		}
		//remove�� ù��° ������ ������ �����ȴ�.
		
	

	}

}
