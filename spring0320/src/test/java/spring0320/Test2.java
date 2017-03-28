package spring0320;

import java.io.IOException;

import org.springframework.context.support.GenericXmlApplicationContext;

import service.Service1;

public class Test2 {
 public static void main(String[] args) throws IOException {
 GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("annotationaopapp.xml");
 Service1 ins = ctx.getBean("service1" ,Service1.class);
 ins.prt();
 ins.view();
 ins.show(3);
 ctx.close();
 }
}
