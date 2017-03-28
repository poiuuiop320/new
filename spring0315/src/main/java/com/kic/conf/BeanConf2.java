package com.kic.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Scope.Member;
import Scope.MemberList;
@Configuration
public class BeanConf2 {

 @Bean(name="ins")
 @Scope(value="protytype")
 public MemberList getojb(){
  MemberList m= new MemberList();
  List<Member> list= new ArrayList<Member>();
  list.add(new Member("a",10));
  list.add(new Member("b",100));
  list.add(new Member("c",50));
  m.setList(list);
  
  return m;
 }
}
