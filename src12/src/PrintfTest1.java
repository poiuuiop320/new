import java.io.*;
public class PrintfTest1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("kor input"); 		
int kor=Integer.parseInt(in.readLine());
		System.out.println("eng input");
		int eng=Integer.parseInt(in.readLine());
		System.out.println("input name");
		String name=in.readLine();
		int tot=kor+eng;
		float avg=tot/2.0f;//���
		String result="";
		switch((int)(avg/10))//��ȣ�ȿ� ����ϰ� ĳ���� ��Ŵ.(���� ����ȯ)
		{
		case 10:
		case 9:result = "��";
		case 8:result ="��";
		case 7:result ="��";
		case 6:result ="��";
		default :result = "��";}
		System.out.printf("�̸�:%s\n",name);
		System.out.printf("����:%d\n",kor);
		System.out.printf("����:%d\n",eng);
		System.out.printf("����:%d\n",tot);
		System.out.printf("���:%.2f\n",avg);
		System.out.printf("���뵵:%s\n",result);
		
		}
			
		
		
	}

