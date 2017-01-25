import java.io.*;
public class Hwtest2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
     
     System.out.println("input s1");
     int su1=Integer.parseInt(in.readLine());
     System.out.println("input s2");
     int su2=Integer.parseInt(in.readLine());
     System.out.println("in?");
     String op=in.readLine();
     
     Cal ins = new Cal();
     int result = 0;
     if(op.equals("+"))
    	{result= ins.add(su1, su2);//객체 호출할때 아래 바로 출력할 수 있다.
     System.out.println(su1+"+"+su2+"="+result);
    	}
     else if (op.equals("-"))
     {	result= ins.sub(su1, su2);
     System.out.println(su1+"-"+su2+"="+result);
     }
     else if(op.equals("*"))
     {
    	 result=ins.mul(su1, su2);
    	 System.out.println(su1+"*"+su2+"="+result);
     }
    	 
     else if(op.equals("/"))
     {
    	 
    	 String r= ins.div(su1, su2);
    			 System.out.println(su1+"/"+su2+"="+r);
     }
     else 
    	 System.out.println("잘못된 연산자입니다.");
	}

}
