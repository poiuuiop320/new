package spring0314;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.sample1.Member1;

public class membertest
{

	public static void main(String[] args)
	{
		
	 GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("app1.xml");
		Member1 ins= ctx.getBean("a1",Member1.class);
		ins.getMember();
		Member1 ins2= ctx.getBean("a2",Member1.class);
		ins2.getMember2();
		
		Member1 ins3=ctx.getBean("a3",Member1.class);
		System.out.println(ins3.getName());
		System.out.println(ins3.getAge());
		
		ctx.close();
		
		
		
	}

}
