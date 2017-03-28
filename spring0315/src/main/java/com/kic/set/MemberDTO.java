package com.kic.set;

public class MemberDTO {
private String name;
private int age;
/**
 * @param name
 * @param age
 */
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

public MemberDTO() {
 super();
}
@Override
public String toString() {
 return "MemberDTO [name=" + name + ", age=" + age + "]";
}
public void setAge(int age) {
 this.age = age;
}
}
