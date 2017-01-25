
public class ArrTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr=new int[2][4];//
System.out.println(arr.length); //행 길이
System.out.println(arr[0].length);//열의 길이
System.out.println(arr[1].length);//열의 길이
for(int i=0; i<arr.length;i++) //행길이 만큼
{
	for(int j=0; j<arr[i].length; j++) //i열길이만큼
	{
		System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
}


	}

}
