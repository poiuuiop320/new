package com.kic.vo;

public class Address {
private String city;
private String gu;
private String street;
public String getCity() {
 return city;
}
public void setCity(String city) {
 this.city = city;
}
public String getGu() {
 return gu;
}
public void setGu(String gu) {
 this.gu = gu;
}
public String getStreet() {
 return street;
}
public void setStreet(String street) {
 this.street = street;
}
/**
 * @param city
 * @param gu
 * @param street
 */
public Address(String city, String gu, String street) {
 this.city = city;
 this.gu = gu;
 this.street = street;
}
/**
 * 
 */
public Address() {
 // TODO Auto-generated constructor stub
}

}
