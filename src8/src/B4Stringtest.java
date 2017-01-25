import java.util.StringTokenizer;

public class B4Stringtest {

	public static void main(String[] args) {
		StringTokenizer stz1 = new StringTokenizer("홍길동 김하나 오준석");
		int count=stz1.countTokens();
		System.out.println(count);
		while(stz1.hasMoreElements())//nextelements
		{
			String st = (String)stz1.nextElement();
			System.out.println(st);
		}
System.out.println("done!");
StringTokenizer stz2= new StringTokenizer("홍길동,김하나,오준석",",");

while(stz2.hasMoreTokens())//nextToken //위둘다 사용가능
{
	System.out.println(stz2.nextToken());
}


	}

}
