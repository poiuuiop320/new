package com.kic.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kic.vo.MemberVO;

@Controller
public class MainController {
 
 @RequestMapping("/form")
 public String form(){
  return "form";
 }
/* @RequestMapping(value="/result", method=RequestMethod.POST)
 public String result(
   //@RequestParam("id") String id  id로 지정할 수 있다 
   @RequestParam String name
   ,@RequestParam int age
   ,@RequestParam String addr
   ,@RequestParam  String tel
   ,@RequestParam String gen
   ,@RequestParam  String fav
   ,@RequestParam  String say
   ,Model model
   )
 {
  //model 이용해서 add한다.
  model.addAttribute("name",name);
  model.addAttribute("age",age);
  model.addAttribute("addr",addr);
  model.addAttribute("tel",tel);
  model.addAttribute("gen",gen);
  model.addAttribute("fav",fav);
  model.addAttribute("say",say);
  
  return "result";
 }
}
*/
/* @RequestMapping(value="/result" ,method=RequestMethod.POST)
 public String result(MemberVO data){
  return "/result";
 }*/
 
 @RequestMapping(value="/result" , method=RequestMethod.POST)
 public String result(@ModelAttribute("mem") MemberVO data){
  return "/result";
 }
}