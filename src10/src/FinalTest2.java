/*fiinal �������
 * �����ڸ� �̿��ؼ� final ������ ����� �� �ִ�. �ʱ�ȭ �Ҽ� �ִ�.
*/
class Final2
{
	public final int su=10;//public final int su;;//The blank final field su may not have been initialized
	public final int su2;
	public Final2(int su2)
	{
		this.su2=su2;
	}//��ü�� ���� ������ �޸𸮰� ���� �Ҵ� �Ǿ� �� �����ڷ� �ٷ�� �ִ�.
}
public class FinalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final2 ins = new Final2(20);
		Final2 ins2 = new Final2(30);
		System.out.println(ins.su);  //�����Ȱ�
		System.out.println(ins2.su); //�����Ȱ�
		System.out.println(ins.su2); //20 ins��ü�� ������ ��������� �����ڸ� �̿��ؼ� ���� (�Ű�������)����ߴ�.�װ��� ���
		System.out.println(ins2.su2);//30 
		   //ins2.su2+=30;///int su=10;su+=30; su=su+30;
		//ins2.su2=ins2.su2+30 //
	
	}

}
