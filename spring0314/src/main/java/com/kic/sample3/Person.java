package com.kic.sample3;

import java.util.List;

public class Person {
 List<String> data1;
 List<MemberDTO> data2;
 public List<String> getData1() {
  return data1;
 }
 public void setData1(List<String> data1) {
  this.data1 = data1;
 }
 public List<MemberDTO> getData2() {
  return data2;
 }
 public void setData2(List<MemberDTO> data2) {
  this.data2 = data2;
 }
 public Person(List<String> data1, List<MemberDTO> data2) {
  super();
  this.data1 = data1;
  this.data2 = data2;
 }
 public Person() {
  super();
 }
 public Person(List<String> data1) {
  super();
  this.data1 = data1;
 }
 
 
 
}
