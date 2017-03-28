package spring0316;

import org.springframework.context.support.GenericXmlApplicationContext;

import DTO.Person;
import Service.Doing;

public class SampleTest3 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("main2.xml");
  Doing do1=ctx.getBean("do1",Doing.class);
  do1.prt();
  do1.show();
  do1.view();
  Person p1 = ctx.getBean("p1", Person.class);
  System.out.println(p1);
  //<context:component-scan base-package="Conf"></context:component-scan>bean 객체 등록
  
  Doing doing2=ctx.getBean("doing2",Doing.class);
  doing2.prt();
  doing2.show();
  doing2.view();
  ctx.close();
 }
}
