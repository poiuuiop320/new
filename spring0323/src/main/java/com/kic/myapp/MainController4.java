package com.kic.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController4 {
 @RequestMapping("/prt")
 public ModelAndView prt(){
  ModelAndView mv = new ModelAndView();
  mv.addObject("name","hong gil dong");
  mv.addObject("age", 10);
  mv.addObject("addr", "서울");
  mv.setViewName("prt");
  return mv;
 }
 @RequestMapping("/forward")
 public String view(Model model){
  model.addAttribute("name","hong gil dong");
  return "redirect:forward";
 }
 @RequestMapping("/redirect")
 public String redirect(Model model){
  
  return "redirect:redirect";
 }
}
