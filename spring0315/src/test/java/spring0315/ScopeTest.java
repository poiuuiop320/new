package spring0315;

import org.springframework.context.support.GenericXmlApplicationContext;

import Scope.MemberList;

public class ScopeTest {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("scope/scope1.xml");
  MemberList ins=ctx.getBean("m1",MemberList.class);
  MemberList ins2=ctx.getBean("m1",MemberList.class);
  
  System.out.println(ins);
  System.out.println(ins2);
  System.out.println(ins==ins2);
  ins.prt();
  ins2.prt();
  ctx.close();
 }
}
