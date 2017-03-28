package com.kic.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
 
 //@RequestMapping("/hello")
 @RequestMapping(value={"/hello","/haha","/hi"})
 public String hello(Model model){
  model.addAttribute("name","hong gil dong");
  model.addAttribute("age",20);
  model.addAttribute("addr","seoul");
  return "hi";
 }
}
