package Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;


public class MemberService {
 @Autowired
 @Qualifier("dto2")//잇을 경우 없을 경우 
 private MemberDTO dto;
 
 @Bean(name="tt")//type으로 Autowire 와 name으로 Autowiare가 있다.xml 에서 type 별 name 별로 autowire 연결 할 수있다
 public MemberDTO getDto() {
  return dto;
 }

 public void setDto(MemberDTO dto) {
  this.dto = dto;
 }


}
