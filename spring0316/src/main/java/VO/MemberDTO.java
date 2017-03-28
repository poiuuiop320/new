package VO;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration

//@Resource(name="m1")//data dto 자료를 Configuration  //6version 부터 나온것
@Component(value="dto1")
public class MemberDTO {
 private String name;
 private int age;
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
 @Override
 public String toString() {
  return "MemberDTO [name=" + name + ", age=" + age + "]";
 }
}
