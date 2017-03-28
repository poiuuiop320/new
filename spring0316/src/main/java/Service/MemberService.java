package Service;

import javax.annotation.Resource;

import VO.MemberDTO;




public class MemberService {

 private MemberDTO dto;
 
 public MemberDTO getDto() {
  return dto;
 }
 
 @Resource(name="dto1")//6version 부터 나온것
 public void setDto(MemberDTO dto) {
  
  this.dto = dto;
 }
 
 
 
 
 /*@Bean
 public MemberDTO ttt(){
  MemberDTO dto = new MemberDTO();
  return dto;
 }*/

}
