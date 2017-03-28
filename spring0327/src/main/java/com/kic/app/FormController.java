package com.kic.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.FoodDTO;
import vo.MemberDTO;

@Controller
public class FormController {
 @RequestMapping("/form")
 public String form(MemberDTO dto,Model model){
  menu(model);
  return "form";
 }
 @RequestMapping("/result")
 public String result(@Validated MemberDTO dto,Errors error,Model model){
  menu(model);
  if(error.hasErrors())
  {menu(model);
  return "form";
  }
  return "result";
 }

 
 public void menu(Model model)
 {
  List<String> fav = new ArrayList<String>();
  fav.add("수영");
  fav.add("달리기");
  fav.add("영화보기");
  fav.add("뮤지컬");
  model.addAttribute("fav",fav);
  List<String>gen=new ArrayList<String>();
  gen.add("남자");
  gen.add("여자");
  
   model.addAttribute("gen", gen);
   
  /* List<String> food=new  ArrayList<String>();
   food.add("떡볶이");
   food.add("김밥");
   food.add("라면");
   food.add("순대");

    model.addAttribute("food", food);*/
   
   List<FoodDTO> food = new ArrayList<FoodDTO>();
   food.add(new FoodDTO("떡볶이","떡볶이"));
   food.add(new FoodDTO("a2","김밥"));
   food.add(new FoodDTO("a3","라면"));
   food.add(new FoodDTO("a4","튀김"));
   
   model.addAttribute("food",food);
 }
 
}
