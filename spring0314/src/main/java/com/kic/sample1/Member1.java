package com.kic.sample1;

import java.util.List;

public class Member1
{
 private String name;
 private int age;
 private  List<String> item;
 private Student st1;

 public Student getSt1() {
  return st1;
 }
 public void setSt1(Student st1) {
  this.st1 = st1;
 }
 public Member1()
 {
  
 }
  public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 public List<String> getItem() {
  return item;
 }




 public void setItem(List<String> item) {
  this.item = item;
 }

 public Member1(String name, int age)
 {
  this.name=name;
  this.age=age;
 }
 public  Member1(List<String> item)
 {
  this.item=item;
 }
 
  // name, age, student
 public void getMember() {
  
  System.out.println("name : "+name);
  System.out.println("age : "+age);
  System.out.println("student ");
  System.out.println("kor :"+ st1.getKor());
  System.out.println("eng : "+st1.getEng());
  System.out.println("math :"+st1.getMath());
  
  
 }
   public void getMember2()
   {
      for(int i=0; i<item.size(); i++)
      {
         System.out.println(item.get(i));
      }
   }
}
