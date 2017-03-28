package com.kic.sample1;

public class Student {
 private int kor;
 private int eng;
 private int math;
 public Student()
 {
  
 }
 public Student(int kor, int eng, int math)
 {
  this.kor=kor;
  this.eng=eng;
  this.math=math;
 }
 
 public void prt()
 {
  System.out.println(kor);
  System.out.println(eng);
  System.out.println(math);
 }
 
 
 
 
 public int getKor() {
  return kor;
 }
 public void setKor(int kor) {
  this.kor = kor;
 }
 public int getEng() {
  return eng;
 }
 public void setEng(int eng) {
  this.eng = eng;
 }
 public int getMath() {
  return math;
 }
 public void setMath(int math) {
  this.math = math;
 }
}
