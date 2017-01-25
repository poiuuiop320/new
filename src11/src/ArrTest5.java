
public class ArrTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr=new int[2][];
arr[0]=new int[4];//위에 선언한가변 배열에 또 배열을 초기화  
arr[1]=new int[6];
/*
System.out.println(arr.length);
System.out.println(arr[0].length);
System.out.println(arr[1].length);*/
for(int i =0;i<arr.length;i++)
{
	for(int j =0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
}
	}

}
