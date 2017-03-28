package Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConf {
 
 @Bean
 public MemberDTO dto(){
  return new MemberDTO("hong");
  
 }
 @Bean
 public MemberDTO dto2(){
  return new MemberDTO("park");
 }
 @Bean
 public MemberService service(){
  return new MemberService();
 }
}
