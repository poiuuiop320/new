package com.kic.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

 @RequestMapping("/hello/{name}/{age}/{addr}")
 public  String  hello(@PathVariable String name
   , @PathVariable int age, @PathVariable String addr, Model model)
 {
  model.addAttribute("name", name);
  model.addAttribute("age", age);
  model.addAttribute("addr", addr);
  return "hello";
 }
}
