package com.kic.val;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import vo.MemberDTO;

public class Validator implements org.springframework.validation.Validator {

 @Override
 public boolean supports(Class<?> arg0) {
  // TODO Auto-generated method stub
  return MemberDTO.class.isAssignableFrom(arg0);
 }

 @Override
 public void validate(Object target, Errors errors) {

  MemberDTO dto = (MemberDTO)target;
 /* 
  if(dto.getName() == null)
  {
   errors.rejectValue("name", "name required");
  }
  if(dto.getAddr() == null)
   errors.rejectValue("addr", "required");
  if(dto.getPhone() == null)
   errors.rejectValue("phone", "required");*/
  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name_required");
  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "addr", "addr_required");
  ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone","phone_required");
  //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "age_required");
//  ValidationUtils.rejectIfEmpty(errors, "age", "age_required");
  
  if(dto.getAge()<0)
  {
   errors.rejectValue("age", "age_lengsize","숫자 0이상입력하세요");
  }
  /*if(dto.getName() == null || dto.getName().trim().isEmpty())
  {
   errors.rejectValue("name", "input name required");
  }
  if(dto.getAddr() == null || dto.getAddr().trim().isEmpty())
  {
   errors.rejectValue("addr", "input addr required");
  }
  if(dto.getPhone() == null || dto.getAddr().trim().isEmpty())
  {
   errors.rejectValue("phone", "input phone required");
  }
  if(dto.getAge() < 0 )
  {
   errors.rejectValue("age", "input age required");
  }*/
 }

}
