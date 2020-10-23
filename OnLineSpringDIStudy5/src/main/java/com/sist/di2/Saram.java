package com.sist.di2;

import org.springframework.stereotype.Component;

@Component("sa")
public class Saram {
	private String name="È«±æµ¿";
	private String sex="³²ÀÚ";
	private int age=30;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
