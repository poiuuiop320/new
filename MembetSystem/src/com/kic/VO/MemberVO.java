package com.kic.VO;

import java.io.Serializable;

public class MemberVO implements Serializable{
private String mid;
private String mname;
private int age;
private float ki;
public MemberVO() {

}
public MemberVO(String mid, String mname, int age, float ki) {
	
	this.mid = mid;
	this.mname = mname;
	this.age = age;
	this.ki = ki;
}

@Override
public String toString() {
	return "MemberVO [mid=" + mid + ", mname=" + mname + ", age=" + age + ", ki=" + ki + "]";
}
public String getMid() {
	return mid;
}
public void setMid(String mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getKi() {
	return ki;
}
public void setKi(float ki) {
	this.ki = ki;
}
}
