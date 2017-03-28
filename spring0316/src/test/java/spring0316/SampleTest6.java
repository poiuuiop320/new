package spring0316;

import org.springframework.context.support.GenericXmlApplicationContext;

import DTO.MemberDTO;

public class SampleTest6 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("required/required.xml");
  MemberDTO dto = ctx.getBean("ttt",MemberDTO.class);
  System.out.println(dto);
  ctx.close();
 }
}
