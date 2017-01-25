
public class B8SystemMethodTest {

	public static void main(String[] args) {
		int[] arr={10,20,30,40,50,60,70};
		int[] arr2=new int[10];
		arr2[0]=200;
		arr2[1]=300;
		arr2[2]=400;
		
		//System.arraycopy(src, srcPos, dest, destPos, length); 
//	System.arraycopy(arr, 1, arr2, 0, 3);0부터 3개
		System.arraycopy(arr, 1, arr2, 3, 3);//3부터 3개
		//reference
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
