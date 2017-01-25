package com.kic.Hw;

public class StudentDTO {
	private String hak;
	private String name;
	private int age;
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
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
	public StudentDTO(String hak, String name, int age) {
		super();
		this.hak = hak;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDTO [hak=" + hak + ", name=" + name + ", age=" + age + "]";
	}


}
