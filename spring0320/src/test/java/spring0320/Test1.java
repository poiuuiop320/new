package spring0320;

import java.io.IOException;

import org.springframework.context.support.GenericXmlApplicationContext;

import service.Service1;

public class Test1 {

 public static void main(String[] args) throws IOException {

  GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("aopapp.xml");
 /* Service1 ins=ctx.getBean("service1", Service1.class);
  Service2 ins2=ctx.getBean("service2", Service2.class); 
  ins.prt();
  ins.view();
  ins.show(10);
  ins2.read();
  ins2.write();*/
  Service1 ins = ctx.getBean("service1",Service1.class);
  ins.prt();
  ins.view();
  ins.show(100);
  ctx.close();
  
 }
}
