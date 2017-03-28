package com.kic.conf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kic.map.Map1;
import com.kic.set.MemberDTO;
/* configration 역할 한다.
*/
@Configuration
public class BeanConf {
 
 @Bean
 public MemberDTO create1()
 {
  return new MemberDTO();
 }
 @Bean
 public MemberDTO create2()
 {
  MemberDTO dto=new MemberDTO();
  dto.setName("hong");
  dto.setAge(22);
  return dto;
 }
 @Bean(name="bean3")/* bean 에 name을 지정할 수 있다.*/
 public MemberDTO create3()
 {
  MemberDTO dto= new MemberDTO();
  return dto;
 }
 /*bean id="create1 "  class= "com.kic.MemberDTO  " 와 같은 것 xml에서 한것과 java소스에서 한것 두 방법중 java방법
 */
 @Bean
 public Map1 mBean1()
 {
  Map1 ins=new Map1();
  Map<String,Integer> m1=new HashMap<String,Integer>();
  ins.setM1(m1);
  m1.put("a1", 10);
  m1.put("a2", 30);
  m1.put("a3", 50);
  m1.put("a4", 10);
  
  return ins;
  
 }
 
}
