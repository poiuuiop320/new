package com.kic.sample4;

public class Person {
 private String name;
 private String addr;
 private int age;
 /**
  * @param name
  * @param addr
  * @param age
  */
 public Person(String name, String addr, int age) {
  super();
  this.name = name;
  this.addr = addr;
  this.age = age;
 }
 /**
  * 
  */
 public Person() {
  super();
  
 }
 /**
  * @param name
  * @param addr
  */
 public Person(String name, String addr) {
  super();
  this.name = name;
  this.addr = addr;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getAddr() {
  return addr;
 }
 public void setAddr(String addr) {
  this.addr = addr;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 /**
  * @param name
  * @param age
  */
 public Person(String name, int age) {
  super();
  this.name = name;
  this.age = age;
 }
 public void prt(){
  System.out.println("name:"+name);
  System.out.println("addr:"+addr);
  System.out.println("age:"+age);
 }
}
