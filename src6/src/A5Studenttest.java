import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A5Studenttest {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		A5StudentService service=new A5StudentService(new ArrayList<A5StudentVO>());//
		String stcode;

		while(true)
		{
			System.out.println("1.�Է�");
			System.out.println("2.����");
			System.out.println("3.��ȸ");
			System.out.println("4.����");
			System.out.println("5.��ü����");
			System.out.println("6.����");
			System.out.println("����?");
			String yn=in.readLine();

			switch(yn)//
			{
			case"1":
				A5StudentVO vo=new A5StudentVO();//vo��� ��ü ����
				System.out.println("�й� �Է�");
				vo.setStcode(in.readLine());
				System.out.println("�а�");
				vo.setDept(in.readLine());
				System.out.println("�̸�");
				vo.setName(in.readLine());
				System.out.println("����");
				vo.setAge(Integer.parseInt(in.readLine()));
				boolean result=service.add(vo);//vo��ü�� ��� ���� ���� ���� result��
				if(result)//
					System.out.println("�߰�����!!");
				else
					System.out.println("����");
				break;
			case"2":
				System.out.println("������ �й�");
				stcode=in.readLine();
				boolean r= service.remove(stcode);
				if(r)
					System.out.println("����");
				else 
					System.out.println("��������");


			case"3":
				System.out.println("��ȸ�� �й�");
				stcode=in.readLine();//
				A5StudentVO data=service.search(stcode);//
				if(data==null)
				{
					System.out.println("�ڷ����");

				}
				else
				{
					System.out.println(data);//
				}
				break;
			case"4":
				data=new A5StudentVO();
				System.out.println("������ �й�");
				data.setStcode(in.readLine());
				System.out.println("������ �̸�");
				data.setName(in.readLine());
				System.out.println("������ ����");
				data.setAge(Integer.parseInt(in.readLine()));
				System.out.println("������ �а�");
				data.setDept(in.readLine());
				result=service.modify(data);
				if(result)
					System.out.println("��������");
				else
					System.out.println("��������");
				break;
			case"5":
				service.printall();//ȣ��
			case"6":
				System.out.println("����");
				System.exit(0);
				break;
			default:
				System.out.println("�ٽ� �Է�");
			}
		}
	}

}
