/*ÀÌ¸§ ±¹¾î ¿µ¾î ÃÑÁ¡ Æò±Õ 
 * 
 * 
*/
import java.io.*;
public class SnngJuckTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
String[] name=new String[10];
int[] kor =new int[10];
int[] eng=new int[10];
int[] tot=new int[10];
float[] avg =new float[10];
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int index=0;
 //while(true) //
for (int i = 0; i < 10; i++) {
	 System.out.println("input name");
	 //name[index++]
	 name[i]=in.readLine();
	 System.out.println("input kor");
	 kor[i]=Integer.parseInt(in.readLine());
	 System.out.println("input eng");
	 eng[i]=Integer.parseInt(in.readLine());
	 tot[i]=kor[i]+eng[i];
	 avg[i]=tot[i]/2.0f;
	 System.out.println("continue?");
	 String yn=in.readLine();
	 index++;
	 
	 if(yn.equals("n")||yn.equals("N"))
		 
		 break;
	 
 } //end  for
    for (int i = 0; i < index-1; i++) {
		for (int j = i+1; j < index; j++) {
			if(tot[i]<tot[j])
			{
				String iname="";
				iname=name[i];
				name[i]=name[j];
				name[j]=iname;
				int imsi;
				imsi=kor[i];
				kor[i]=kor[j];
				kor[j]=imsi;
				
				imsi=eng[i];
				eng[i]=eng[j];
				eng[j]=imsi;
				
				imsi=tot[i];
				tot[i]=tot[j];
				tot[j]=imsi;
				
				float iavg=avg[i];
				avg[i]=avg[j];
				avg[j]=iavg;
				
				
			}
		}
	}
    System.out.println("ÀÌ¸§\t ±¹¾î\t ¿µ¾î\t ÃÑÁ¡\t Æò±Õ");
    for (int i = 0; i < index; i++) {
    	  System.out.printf("%s \t %d \t %d \t %d \t %.1f\n"
     			 , name[i], kor[i], eng[i], tot[i], avg[i]);
	}

	}

}
