package spring0317;

import org.springframework.context.support.GenericXmlApplicationContext;

import Config.ConnectProvier;

public class conftest2 {
 public static void main(String[] args) {
  GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("xml/confapp2.xml");
  ConnectProvier ins = ctx.getBean("connpro",ConnectProvier.class);
  
  System.out.println(ins.getDriver());
  System.out.println(ins.getUrl());
  System.out.println(ins.getUser());
  System.out.println(ins.getPassword());
  ctx.close();
 }
}
