package spring0316;

import org.springframework.context.support.GenericXmlApplicationContext;

import Life.BeanLife2;

public class LifeTest2 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("life/life2app.xml");
  BeanLife2 ins = ctx.getBean("bean1",BeanLife2.class);
  ins.prt();
  ctx.close();
 }
}
