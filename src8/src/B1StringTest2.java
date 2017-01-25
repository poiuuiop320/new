import java.util.Iterator;

public class B1StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍 길동입니다";
		String name2="my_name_is hong kil dong";
		System.out.println(name.length());
		System.out.println(name2.length());
		char ch=name.charAt(3);
		char ch2=name2.charAt(3);
		System.out.println(ch);
		System.out.println(ch2);
		
		String a1 = "homg";
		String a2="Hom";
		
		System.out.println(a1.compareTo(a2));//문자열과 문자열 비교는 compareTo를 비교한다.
		System.out.println(a1.compareToIgnoreCase(a2));//대소문자 구분없이 문자열 비교
		
		String a3="Abcdabcdabcd";
		int loc =a3.indexOf("b",3);//n부터 찾는다 문자열
		//int loc =a3.indexOf("b");//0부터
		System.out.println(loc);
		String dept="aaa;bbb;ccc;";
		String[] arr=dept.split(";");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (String string : arr) {
			System.out.println(string);
			
		}
		String irum="hong kildong";
				String result = irum.substring(2);//n부터
		System.out.println(result);
		
		String result2=irum.substring(3, 4);//n부터 ,(콤마)n까지
		System.out.println(result2);
		
		String aaa="                        a  b    c      d ";
		System.out.println(aaa.trim());
		System.out.println(aaa);//aaa.toString()이거와 같은
		
		String n1="hong gildong";
		String nn= n1.replace("g", "123");
		System.out.println(nn);

	}

}
