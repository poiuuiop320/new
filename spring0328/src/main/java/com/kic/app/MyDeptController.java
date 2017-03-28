package com.kic.app;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.myDAO;

@Controller
public class MyDeptController {
 @Autowired
 private myDAO mydao;

 @RequestMapping("/view/{deptno}")
 public String view(@PathVariable(value="deptno") int deptno, Model model)
 {
  model.addAttribute("count", mydao.dataCount());
  model.addAttribute("dname",mydao.getDeptName(deptno));
  model.addAttribute("dto", mydao.getData(deptno));
  model.addAttribute("list" , mydao.getList());
  return "view";
 }
 
 

}
