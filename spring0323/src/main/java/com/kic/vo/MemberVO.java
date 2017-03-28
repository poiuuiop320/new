package com.kic.vo;

public class MemberVO {
private String name;
private int age;
private String addr;
private String tel;
private String gen;
private String fav;
private String say;
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
public String getAddr() {
 return addr;
}
public void setAddr(String addr) {
 this.addr = addr;
}
public String getTel() {
 return tel;
}
public void setTel(String tel) {
 this.tel = tel;
}
public String getGen() {
 return gen;
}
public void setGen(String gen) {
 this.gen = gen;
}
public String getFav() {
 return fav;
}
public void setFav(String fav) {
 this.fav = fav;
}
public String getSay() {
 return say;
}
public void setSay(String say) {
 this.say = say;
}
/**
 * @param name
 * @param age
 * @param addr
 * @param tel
 * @param gen
 * @param fav
 * @param say
 */
public MemberVO(String name, int age, String addr, String tel, String gen, String fav, String say) {
 this.name = name;
 this.age = age;
 this.addr = addr;
 this.tel = tel;
 this.gen = gen;
 this.fav = fav;
 this.say = say;
}
/**
 * 
 */
public MemberVO() {
 // TODO Auto-generated constructor stub
}

}
