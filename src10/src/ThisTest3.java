class This3
{
	private String name;
	private int age;
	private String addr;
	public This3(String name,int age,String addr)
	{
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	public This3(String name)//�⺻ ���� ���� ������ �����ڸ� Ȱ���� �� �ִ�.
	{
		this(name,0,"����");
	}
	public String prt()
	{
		return "name:"+name+",age:"+age+",addr:"+addr;
	}
}
public class ThisTest3 {

	public static void main(String[] args) {
		
		This3 ins = new This3("���ϳ�");//�ϳ��� �Ű������� �ѱ�
        System.out.println(ins.prt());//��������ʰ� �ٷ� ���� ���� �� ����
	}

}
