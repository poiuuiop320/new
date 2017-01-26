import java.util.LinkedHashSet;
import java.util.Random;

public class A1BasePro {
	Random rnd=new Random(System.currentTimeMillis());
	
	public  LinkedHashSet<Integer>  computer()
	{
		
		LinkedHashSet<Integer> combase=new LinkedHashSet<>();
        while(combase.size()<3)
        {
        	combase.add(rnd.nextInt(10));
        	
        }
		return combase;
	
	
	
	
	
/*	 public int[]  computer()
	 {
		 combase[0]=rnd.nextInt(10);

		 for(int i=1; i<combase.length; i++)
		 {
			 combase[i]=rnd.nextInt(10);
			 for(int j=0; j<i; j++)
			 {
				 if(combase[i]==combase[j])
				 { 
					 i--;
					 break;
				 }
			 }
		 }
	   
		 return  combase;
	 }*/
	
	
	
}
}