package com.lee.sdi2.main;

//singleton : 유일한 객체
//static : 객체가 여러개인데 그 객체들이 공통 속성을 가지고 있을 때

public class Kimsumi {
	private String name;
	private int age;

	public Kimsumi() {
	}

	public Kimsumi(String name, int age) {
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

	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
