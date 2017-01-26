import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class A1Baseballtest {
	public static void main(String[] args) {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        A1BasePro ins=new A1BasePro();
       
       // int[] com=ins.computer();
        
        for(int i=0; i<10; i++)
        {
        LinkedHashSet<Integer> com=ins.computer();
        
       
        }
      /*  
        int[] user=new int[3];
	
        
	loop:for(; ;)
	{
	try{
		System.out.println("숫자를 입력하세요");
		int su=Integer.parseInt(in.readLine());
	    String a=su+"";
	    for(int i=0; i<a.length(); i++)
	    {
	       	user[i]= a.charAt(i)-'0';
	    }
	    
	   for(int i=0; i<user.length-1; i++)
	   {
		   for(int j=i+1;j<user.length; j++ )
		   {
			   if(user[i]==user[j])  
				   continue loop;
		   }
		   
	   }
	   
	    
	   break;
	}catch(NumberFormatException e)
	{
		System.out.println("숫자를 잘못 받았습니다");
	}catch(IOException e)
	{
		System.out.println("입출력오류");
	}
	
	}
	  System.out.println(user[0]+", "+user[1]+", "+user[2]);
        int s=0, b=0;
       for(int i=0; i<com.length; i++)
       {
    	   for(int j=0; j<user.length; j++)
    	   {
    		   if(com[i]== user[j] && i==j)
                  s++;
    		   else if(com[i]==user[j])
    			   b++;
    			   
    	   }
    	   
    	   
       }
       
       System.out.println("스트라이크 :"+s+", 볼 :"+b);
        
	
        */
		
	}

}