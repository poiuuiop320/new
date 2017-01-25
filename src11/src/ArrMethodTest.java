class Person
{
	int su;
	void prt1(int su)//배열을 받아서 출력하는 메서드
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

	public static void main(String[] args) {//시스템에 넘기는
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
      //배열 값을 넘길때 새로 초기화시켜 넘긴다.
      ins.prt2(new int[]{40,50,60});//메서드호출할때 값을 같이 넘길때 새로 값을 초기화해서 넘길 수 있다.
      /*
      int[] a1=new int[3];
      int[] a2={10,20,30};
      int[] a3=new int[]{100,200,300};마지막만.*/
      
	}

}
