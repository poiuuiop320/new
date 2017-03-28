package com.kic.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.BoardDTO;

@Controller
public class BoardController {
 @RequestMapping("/boardform")
 public String pro(){
  return "boardform";
 }
 
 @RequestMapping("/boardform2")
 public String pro2(BoardDTO dto){
  return "boardform2";
 }
 
 @RequestMapping("/boardresult")
 public String result(@Validated BoardDTO data,Errors error){
  if(error.hasErrors())
  {
   System.out.println(error.getFieldError());
//   return "redirect:boardform";
   return "boardform2";
  }
  return "boardresult";
 }
}
