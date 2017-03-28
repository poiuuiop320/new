package com.kic.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kic.val.Validator;

import vo.MemberDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

  @RequestMapping("/myform")
  public String memberform(){
   
   return "memberform";
  }

  @RequestMapping("/myform2")
  public String memberform(MemberDTO dto){
   
   return "memberform2";
  }
 
  @RequestMapping("/myresult")
  public String memberresult(@Validated MemberDTO dto,BindingResult result)
  {
  /* Validator validator = new Validator();
   validator.validate(dto, result);*/
   if(result.hasErrors())
   {
    System.out.println(result.getFieldError());
//    return "redirect:myform";
    return "memberform2";
   }
   return "memberresult";
  }
  @InitBinder
  public void initbind(WebDataBinder bind)
  {
   bind.setValidator(new Validator());
  }
	
}
