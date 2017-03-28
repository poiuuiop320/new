package com.kic.sample5;

public class MemberDTO {
private String name;
private int age;

public void setName(String name) {
 this.name = name;
}
public void setAge(int age) {
 this.age = age;
}
public void prt()
{
 System.out.println("name:"+name);
 System.out.println("age:"+age);
}
}
