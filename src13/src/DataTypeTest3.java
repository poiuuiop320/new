
public class DataTypeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte a=20;
byte b=30;
//byte c= a+b;//���� byte, short, int ������ intŸ������ ���Ѵ�.
byte c=(byte)(a+b);//��ȣ�� ���� ��Ʈ������ ���� ����ȯ int�� ��
System.out.println(c);

//����ũ��Ÿ�԰� �������� ūũ�⿡ ����ȯ�� �ȴ�.
int a1=10;
long a2=20;
float su=a1+a2;  //float �Ҽ������� ����ȴ�.
System.out.println(su);
	}

}
