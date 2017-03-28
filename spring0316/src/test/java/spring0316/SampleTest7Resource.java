package spring0316;

import org.springframework.context.support.GenericXmlApplicationContext;

import Service.MemberService;

public class SampleTest7Resource {
 public static void main(String[] args) {
//  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfBean.class);
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:resource/resource.xml");
  MemberService s = ctx.getBean("p1",MemberService.class);

  System.out.println(s);
  ctx.close();
 }
}
