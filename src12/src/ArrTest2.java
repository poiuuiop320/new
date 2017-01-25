
public class ArrTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[3];
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	for (int j = 0; j < arr.length; j++) {
		System.out.println(arr[i]);
	}
}
	}

}
