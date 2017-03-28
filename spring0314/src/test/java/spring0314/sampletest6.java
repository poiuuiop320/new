package spring0314;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.scope.BeanScope;

public class sampletest6 {

 public static void main(String[] args) {

  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("beanscope.xml");
  BeanScope beanScope1=ctx.getBean("b1",BeanScope.class);
  BeanScope beanScope2=ctx.getBean("b1",BeanScope.class);
  beanScope1.prt();
  beanScope2.prt();
  System.out.println(beanScope1==beanScope2);
  ctx.close();
 }

}
