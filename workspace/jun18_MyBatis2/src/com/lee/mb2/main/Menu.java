package com.lee.mb2.main;

import java.math.BigDecimal;

//MyBatis에서 자동으로 매핑을 해줌.
//조건
//1. DB필드명 = 멤버 변수명
//2. 숫자는 BigDecmal 타입으로 -> int형, double형 모두 소화

public class Menu {
	private String name;
	private BigDecimal price;
	private BigDecimal price2;

	public Menu() {

	}

	public Menu(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Menu(String name, BigDecimal price, BigDecimal price2) {
		super();
		this.name = name;
		this.price = price;
		this.price2 = price2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice2() {
		return price2;
	}

	public void setPrice2(BigDecimal price2) {
		this.price2 = price2;
	}

}
