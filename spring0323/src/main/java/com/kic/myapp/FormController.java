package com.kic.myapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kic.vo.MemberDTO;

@Controller
public class FormController {
 @RequestMapping("/views/form")
 public String form(){
  return "a1/form";
 }
 @RequestMapping("/views/result")
  public String result(MemberDTO data){
   return"a1/result";
  }
 @ModelAttribute("data")
 public List<String> data(){
  List<String> arr = new ArrayList<String>();
  arr.add("hong");
  arr.add("kim");
  arr.add("park");
  return arr;
 }
 @RequestMapping("/view1")
 public String result2(MemberDTO dto){
  return "view1";
 }
 @RequestMapping("/view2")
 public String result3(MemberDTO dto){
  return "view2";
 }
 }

