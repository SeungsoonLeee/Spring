package com.lee.sdi2.main;

import org.springframework.beans.factory.annotation.Autowired;

public class Foodset {
	private String name;
	private int price;
	private double weight;
	private String product;

	@Autowired // spring에서 사용하는 static 방식으로 beans.xml에 등록된 kimsumi 객체와 자동 연결
	private Kimsumi maker; // 수많은 Foodset들의 공통적인 사항 -> static
	// 생성자, getter, setter 아무것도 처리 안해도 됨.

	public Foodset() {
	}

	public Foodset(String name, int price, double weight, String product) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(weight);
		System.out.println(product);
		maker.print();
	}
}
