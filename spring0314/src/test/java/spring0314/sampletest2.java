package spring0314;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kic.sample2.T1;

public class sampletest2 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("app2.xml");
  
  
  T1 ins=ctx.getBean("t1",T1.class);
  ins.doing();
  
  T1 ins2= ctx.getBean("t2",T1.class);
  ins2.doing();
  ctx.close();
 }
}
