package com.kic.vo;

public class MemberDTO {
 private String name;
 private int age;
 private Address addr;
 /**
  * 
  */
 public MemberDTO() {
  // TODO Auto-generated constructor stub
 }
 /**
  * @param name
  * @param age
  * @param addr
  */
 public MemberDTO(String name, int age, Address addr) {
  this.name = name;
  this.age = age;
  this.addr = addr;
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
 public Address getAddr() {
  return addr;
 }
 public void setAddr(Address addr) {
  this.addr = addr;
 }
}
