import java.util.StringTokenizer;

public class B4Stringtest {

	public static void main(String[] args) {
		StringTokenizer stz1 = new StringTokenizer("ȫ�浿 ���ϳ� ���ؼ�");
		int count=stz1.countTokens();
		System.out.println(count);
		while(stz1.hasMoreElements())//nextelements
		{
			String st = (String)stz1.nextElement();
			System.out.println(st);
		}
System.out.println("done!");
StringTokenizer stz2= new StringTokenizer("ȫ�浿,���ϳ�,���ؼ�",",");

while(stz2.hasMoreTokens())//nextToken //���Ѵ� ��밡��
{
	System.out.println(stz2.nextToken());
}


	}

}
