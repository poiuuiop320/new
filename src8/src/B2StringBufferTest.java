/*String
 * StringBuffer ����ȭ�Ȱ�
 * StringBuilder �񵿱�ȭ
 * 
 * 
 * 
 * 
*
*
*
*/
public class B2StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1=new StringBuffer("asdfefg");
	    StringBuffer sb2=new StringBuffer(10);
	    
	    System.out.println(sb.length());
	    System.out.println(sb1.length());
	    System.out.println(sb2.length());
	    System.out.println("-------");
	    System.out.println(sb.capacity());//�⺻�뷮
	    System.out.println(sb1.capacity());//16+7
	    System.out.println(sb2.capacity());//10
	    System.out.println("==========");


	}

}
