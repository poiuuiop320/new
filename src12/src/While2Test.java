//import java.io.*;
public class While2Test {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		

		
		
/*	int i=1;

while(i<=9)
	
{	int j =2;
	while(j<=5)
	{
		System.out.print(j+"*"+i+"="+(i*j)+" \t ");
		j++;
	}
	i++;
	System.out.println();
}*/
		//BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("input height");
		
		/*while(i<=h)//���� �� ������ ������ ����
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
			
		}*/
		//int h =Integer.parseInt(in.readLine());
		int i=1;
		int count=0;
     	while(i<5)
     	{
     		int j=1;
     		while(j<=i)
     		{
     			count++;//ī���� ������ ����� �Ѵ�.
     			System.out.print(count*3+"\t");
     			j++;
     		}
     		i++;
     		System.out.println();
     	}

	}

}
