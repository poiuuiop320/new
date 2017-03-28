package com.kic.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kic.vo.MemberVO;

@Controller
public class MainController {
 @RequestMapping("/form")
 public String main()
 {
  return "form";
 }
 /*
 @RequestMapping("/result")
public String pp(HttpServletRequest request,Model model)
 {
 String name = request.getParameter("name");
 int age = Integer.parseInt(request.getParameter("age"));
 String addr = request.getParameter("addr");
 model.addAttribute("name",name);
 model.addAttribute("age",age);
 model.addAttribute("addr",addr);
  return "result";
 }*/
 /*@RequestMapping("/result")
public String pp(@RequestParam String name,@RequestParam int age,@RequestParam String addr,@RequestParam String[] food ,Model model)
{
 model.addAttribute("name",name);
 model.addAttribute("age",age);
 model.addAttribute("addr",addr);
 model.addAttribute("food",food);
 return "result";
}*/
 @RequestMapping("/result")
 public String pp(MemberVO data)
 {
  return "result";
 }

  
}
