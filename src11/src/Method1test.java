class Method2
{
	void painting(int age,float c2,String name){//painting �� �����̴�.������� �˱� ���� �̸��� �����Ѵ�.
		                                                           //���������� painting������ �������.
		              //c1 c2 name �̰͵��� �Ű������̰� arguments�����
		System.out.println("�׸��ϴ�.");
		System.out.println(age+c2+name);
		
	}
	/*Sting tot(int c1,int c2, int c3){
		return c1+c2+c3+"�Դϴ�.";
	}*/
	int tot(int c1,int c2, int c3){
		if(c1>10)//
			return c1+c2+c3;
		else 
			return c1;
	}
	/*int tot(int c1,int c2, int c3){
		if(c1>10)//
			return c1+c2+c3;
		                //else�� �����Ȱ�
			return c1;
	}*/
}
public class Method1test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method2 ins = new Method2();
int age=10;
float jumsu=10.2f;
String name="hong";
//ins.painting(10,10.2f,"hondgildong");//�Ѱ��ٶ� �����־ �ǰ� ������ �־ �ȴ�.
ins.painting(age, jumsu, name);//���� ������ �����ؾ� �Ѵ�.
ins.tot(80,89,90);
	}

}
