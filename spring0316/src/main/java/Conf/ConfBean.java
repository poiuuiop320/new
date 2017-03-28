package Conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Service.MemberService;
@Configuration
public class ConfBean {
 @Bean
 public MemberService p1(){
  return new MemberService();
 }
}
