package spring0316;

import org.springframework.context.support.GenericXmlApplicationContext;

import Fact.BeanFactory;

public class SampleTest4 {

 public static void main(String[] args) {
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("fact/fact.xml");
  BeanFactory bf = ctx.getBean("fact1",BeanFactory.class);
  System.out.println(bf);
 ctx.close();
 }

}
