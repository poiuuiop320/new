package spring0316;

import org.springframework.context.support.GenericXmlApplicationContext;

import Autowired.MemberDTO;
import Autowired.MemberService;

public class SampleTest5Autowire {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("Autowired/Autowired2.xml");
  MemberService s = ctx.getBean("service",MemberService.class);
  MemberDTO dto = s.getDto();
  System.out.println(dto);//<context:annotation-config></context:annotation-config>
  ctx.close();
 }
}
