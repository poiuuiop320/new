
public class B3StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//16개공간이생김
		sb.append("홍길동");
		sb.append("1234");
		sb.append("abcdefghijk");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println(sb.toString());//아래와같음
		System.out.println(sb);//기존 스트링버퍼를 출력
		
		sb.delete(3, 5);
		System.out.println(sb);
		sb.insert(4, "kim");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());//저장할수있는 용량
		System.out.println(sb.length());//글자에대한
		

	}

}
