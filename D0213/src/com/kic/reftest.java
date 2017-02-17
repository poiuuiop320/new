package com.kic;

public class reftest {
	public static void main(String[] arg)
	{
		try{
			Class c=Class.forName("com.kic.ref");
			Object ins=c.newInstance();

			if(ins instanceof ref)
			{
				ref a= (ref)ins;
				a.prt();
			}

		}catch(ClassNotFoundException e){System.out.println(e);}
		catch(InstantiationException e){System.out.println(e);}
		catch(IllegalAccessException e){System.out.println(e);}

	}
}
