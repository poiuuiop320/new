package com.kic.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kic.vo.MemberVO;

@Controller
@RequestMapping(value="/hello")
public class MainController {
 @RequestMapping("/form")
 public String main(){
  return "form";
 }
 @RequestMapping(value="/result" ,method=RequestMethod.POST)
  public String result(MemberVO member)
  {
   return "result";
  }
 @RequestMapping(method=RequestMethod.GET )
 public String a1()
 {
  return "a1";
  
 }
 @RequestMapping(method=RequestMethod.POST)
 public String a2()
 {
   return "a2";
 }
 }

