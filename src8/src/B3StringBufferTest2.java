
public class B3StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//16�������̻���
		sb.append("ȫ�浿");
		sb.append("1234");
		sb.append("abcdefghijk");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println(sb.toString());//�Ʒ��Ͱ���
		System.out.println(sb);//���� ��Ʈ�����۸� ���
		
		sb.delete(3, 5);
		System.out.println(sb);
		sb.insert(4, "kim");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());//�����Ҽ��ִ� �뷮
		System.out.println(sb.length());//���ڿ�����
		

	}

}
