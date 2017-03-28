package spring0317;

import org.springframework.context.support.GenericXmlApplicationContext;

import target.Target1;
import target.Target2;

public class aopTest {
 public static void main(String[] args) {
 GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("xml/aopapp.xml");
 Target1 ins1 = ctx.getBean("tar1",Target1.class);
 Target2 ins2 = ctx.getBean("tar2",Target2.class);
 ins1.Target1_prt1();
 ins1.Target1_prt2();
 ins2.Target2_prt1();
 ins2.Target2_prt2();//advice 정보가 들어온다.<aop:before>을 사용한 경우
 ctx.close();
 }
}
