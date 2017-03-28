package spring0315;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kic.conf.BeanConf2;

import Scope.MemberList;

public class ScopeTest2 {
 public static void main(String[] args) {
  
 
 AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(BeanConf2.class);
 MemberList ins1=ctx.getBean("ins",MemberList.class);
 MemberList ins2=ctx.getBean("ins",MemberList.class);
 System.out.println(ins1);
 System.out.println(ins2);
 System.out.println(ins1==ins2);
 ctx.close();
 }
}
