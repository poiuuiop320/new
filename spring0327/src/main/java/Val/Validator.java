package Val;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import vo.MemberDTO;

public class Validator implements org.springframework.validation.Validator {

 @Override
 public boolean supports(Class<?> clazz) {
  // TODO Auto-generated method stub
  return MemberDTO.class.isAssignableFrom(clazz);
 }

 @Override
 public void validate(Object target, Errors errors) {
 MemberDTO dto = (MemberDTO) target;
 
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id_required");
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password_required");
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name_required");
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email_required");
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "say", "say_required");
 ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fav", "fav_required");
 

 }

}
