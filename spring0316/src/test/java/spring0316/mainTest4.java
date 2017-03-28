package spring0316;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Conf.mainConf;
import Service.Doing;

public class mainTest4 {
 public static void main(String[] args) {
  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(mainConf.class);

  Doing doing2 = ctx.getBean("doing2",Doing.class);

  doing2.prt();
  doing2.show();
  doing2.view();
  ctx.close();
 }
}
