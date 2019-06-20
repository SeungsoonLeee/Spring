package com.lee.sdi.main;

public class Human {
	private String name;
	private int age;

	public Human() {
		System.out.println("사람 객체 생성");
	}

	public Human(String name, int age) {
		super();
		System.out.println("사람 객체 오버로딩하여 생성");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		System.out.println("getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	public int getAge() {
		System.out.println("getAge");
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge");
		this.age = age;
	}

}
