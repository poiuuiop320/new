class A1
{
	void t1(){System.out.println("A1-t1");}
}
class B1 extends A1
{
	void t2(){System.out.println("b1-t2");}
}

public class ClassCastTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A1 ins=new B1();
     //  System.out.println(ins instanceof B1); 
	 B1 ins2;
      if(ins instanceof B1)	
	  {
		  ins2=(B1)ins;
		  ins2.t1(); ins2.t2();
	  }
     A1 ins3=new A1();
     B1 ins4;
       if(ins3 instanceof B1)
       {
    	   ins4=(B1)ins3;
    	   ins4.t1(); ins4.t2();
       }else
       {
    	   System.out.println("º¯°æ¾ÈµÊ!!");
       }
		
	}
}







