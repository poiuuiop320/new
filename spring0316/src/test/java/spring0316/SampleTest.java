package spring0316;

import org.springframework.context.support.GenericXmlApplicationContext;

import DTO.Person;
import Service.Doing;

public class SampleTest {
 public static void main(String[] args) {
  /*String[] path={"serviceapp.xml","dtoapp.xml"};
  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext(path);*/
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("main.xml");
  Doing d1=ctx.getBean("k1",Doing.class);
  Person p1 = ctx.getBean("p1", Person.class);
  System.out.println(d1);
  System.out.println(p1);
  d1.view();
  d1.prt();
  d1.show();
  p1.getName();
  p1.getAge();
  ctx.close();
 }
}
