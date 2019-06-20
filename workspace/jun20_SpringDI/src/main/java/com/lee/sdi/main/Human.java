package com.lee.sdi.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Human {
	private String name;
	private int age;
	private Monster pet;

	private String[] nickname;
	private ArrayList<String> toDoList;
	private HashMap<String, String> family;

	public Human() {
		System.out.println("사람 객체 생성");
	}

	public Human(String name, int age) {
		super();
		System.out.println("사람 객체 오버로딩하여 생성");
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, Monster pet) {
		super();
		System.out.println("사람 객체 오버로딩하여 생성");
		this.name = name;
		this.age = age;
		this.pet = pet;
	}

	public Human(String name, int age, Monster pet, String[] nickname, ArrayList<String> toDoList,
			HashMap<String, String> family) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
		this.nickname = nickname;
		this.toDoList = toDoList;
		this.family = family;
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

	public Monster getPet() {
		return pet;
	}

	public void setPet(Monster pet) {
		this.pet = pet;
	}

	public String[] getNickname() {
		return nickname;
	}

	public void setNickname(String[] nickname) {
		this.nickname = nickname;
	}

	public ArrayList<String> getToDoList() {
		return toDoList;
	}

	public void setToDoList(ArrayList<String> toDoList) {
		this.toDoList = toDoList;
	}

	public HashMap<String, String> getFamily() {
		return family;
	}

	public void setFamily(HashMap<String, String> family) {
		this.family = family;
	}

}
