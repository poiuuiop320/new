package spring0320;

import org.springframework.context.support.GenericXmlApplicationContext;

import service.Service3;

public class Test3 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("aopapp3.xml");
  Service3 ins = ctx.getBean("service",Service3.class);
  String[] arr = {"1","2","a","b","A","B","C","d","e","f"};
  ins.write();
  ins.read(arr);
  ins.read(new String[]{"aa","bb"});//exception 처리확인
  ctx.close();
  
 }
}
