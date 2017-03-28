package com.kic.vo;

public class MemberVO {
private String name;
private int age;
private String addr;
private String[] food;
public String getName() {
 return name;
}
/**
 * 
 */
public MemberVO() {
		super();
 // TODO Auto-generated constructor stub
}
/**
 * @param name
 * @param age
 * @param addr
 * @param food
 */
public MemberVO(String name, int age, String addr, String[] food) {
		super();
 this.name = name;
 this.age = age;
 this.addr = addr;
 this.food = food;
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
public String getAddr() {
 return addr;
}
public void setAddr(String addr) {
 this.addr = addr;
}
public String[] getFood() {
 return food;
}
public void setFood(String[] food) {
 this.food = food;
}
}
