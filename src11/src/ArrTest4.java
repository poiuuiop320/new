
public class ArrTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr=new int[2][4];//
System.out.println(arr.length); //�� ����
System.out.println(arr[0].length);//���� ����
System.out.println(arr[1].length);//���� ����
for(int i=0; i<arr.length;i++) //����� ��ŭ
{
	for(int j=0; j<arr[i].length; j++) //i�����̸�ŭ
	{
		System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
}


	}

}
