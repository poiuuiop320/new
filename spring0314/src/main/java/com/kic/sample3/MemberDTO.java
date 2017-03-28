package com.kic.sample3;

public class MemberDTO {
private String name;
private int age;
@Override
public String toString() {
 return "MemberDTO [name=" + name + ", age=" + age + "]";
}
public MemberDTO() {
 super();
}
public MemberDTO(String name, int age) {
 super();
 this.name = name;
 this.age = age;
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
}
