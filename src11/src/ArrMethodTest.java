class Person
{
	int su;
	void prt1(int su)//�迭�� �޾Ƽ� ����ϴ� �޼���
	{
		
			System.out.println(su);
		
		
	}
	void prt2(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
public class ArrMethodTest {

	public static void main(String[] args) {//�ý��ۿ� �ѱ��
		// TODO Auto-generated method stub
      Person ins = new Person();
      ins.prt1(10);
      int su=20;
      ins.prt1(su);
      System.out.println("======");
      int[] p=new int[3];
      p[0]=20;
      p[1]=30;
      p[2]=40;
      
      ins.prt2(p);
      System.out.println("======");
      //�迭 ���� �ѱ涧 ���� �ʱ�ȭ���� �ѱ��.
      ins.prt2(new int[]{40,50,60});//�޼���ȣ���Ҷ� ���� ���� �ѱ涧 ���� ���� �ʱ�ȭ�ؼ� �ѱ� �� �ִ�.
      /*
      int[] a1=new int[3];
      int[] a2={10,20,30};
      int[] a3=new int[]{100,200,300};��������.*/
      
	}

}
