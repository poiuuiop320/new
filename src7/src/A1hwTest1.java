import java.io.BufferedReader;
import java.io.InputStreamReader;

class Sungjuck
{
	//�ν��Ͻ������� private�� ����Ѵ�
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;

	public String getName() {
		return name;//����
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;//����
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public Sungjuck()
	{

	}
	public Sungjuck(String name, int kor, int eng)
	{
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	@Override
	public String toString() 
	{
		return "Sungjuck [name=" + name + ", kor=" + kor + ", eng=" + eng + ", tot=" + tot + ", avg=" + avg + "]";
	}
}
public class A1hwTest1 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));//ctrl+ shift +o  //ctrl+i
		Sungjuck[] s= new Sungjuck[10];//��ü���������� ����Ҽ��ִ�.
		int index=0;
		while(true)
		{
			s[index]=new Sungjuck();
			System.out.println("input name");
			s[index].setName(in.readLine());
			System.out.println("input kor");
			s[index].setKor(Integer.parseInt(in.readLine()));
			System.out.println("input eng");
			s[index].setEng(Integer.parseInt(in.readLine()));
			System.out.println("continue?");
			String yn=in.readLine();
			if("n".equalsIgnoreCase(yn)|| index==9)
				break;
			index++;
		}
		for (int i = 0; i <=index-1; i++) {
			for (int j =i+1; j <=index; j++) {
				if(s[i].getName().compareTo(s[j].getName())>0)
				{
					Sungjuck imsi=s[i];
					s[i]=s[j];
					s[j]=imsi;
				}
				
			}
			
		}
		System.out.println("name \t kor\t eng\t tot avg");
		for(int i=0; i<=index; i++)
		{
			int tot=s[i].getKor()+s[i].getEng();
			double avg=tot/2.0;
			System.out.printf("%s  %d %d %d %.1f\t", s[i].getName(), s[i].getKor(), s[i].getEng(), tot, avg );



			/*for (int i = 0; i < 10; i++) {
			 *while(true)
			System.out.println("input name");
			String name=in.readLine();
			System.out.println("input kor");
			int kor=Integer.parseInt(in.readLine());
			System.out.println("input eng");
			int eng=Integer.parseInt(in.readLine());
			s[index]=new Sungjuck(name,kor,eng);
			System.out.println("continue?");
			String yn=in.readLine();
			//if(yn.equalsIgnoreCase("n"))//�Ʒ��� ���� ����� �� �ִ�.
			if("n".equalsIgnoreCase(yn)||9==index)
			break;
			index++;		

		}*/

		}
		


	}
}
