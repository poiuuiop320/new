/*
 *��Ʈ���� &:and |:or ~:not ^:xor ex(clusive or)
 *������ ǥ���ϴ� ��� 2�Ǻ��� : 1�Ǻ���(0>1, 1>0)+1
 *
*/public class BiteOpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int result=~a;//2�Ǻ����� ǥ�� -10:~a+1 => -a:-11
System.out.println(result);
int su1=10;
int su2=20;
int result2=su1|su2;// and ��Ʈ ����
System.out.println(result2);

	}

}
