package spring0314;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.sample4.Person;

public class sampletest4 {

 public static void main(String[] args) {

  GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("app4.xml");
  Person ins1=ctx.getBean("a1",Person.class);
  ins1.prt();
  Person ins2=ctx.getBean("a2",Person.class);
  ins2.prt();
  Person ins3=ctx.getBean("a3",Person.class);
  ins3.prt();
  Person ins4=ctx.getBean("a4",Person.class);
  ins4.prt();
  ctx.close();
 }

}
