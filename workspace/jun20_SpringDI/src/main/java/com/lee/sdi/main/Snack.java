package com.lee.sdi.main;

import java.util.Date;
import java.util.HashMap;

public class Snack {
	private String name;
	private int price;
	private Date exp;
	private HashMap<String, Integer> nutriFact;

	public Snack() {
	}

	public Snack(String name, int price, Date exp, HashMap<String, Integer> nutriFact) {
		super();
		this.name = name;
		this.price = price;
		this.exp = exp;
		this.nutriFact = nutriFact;
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

	public Date getExp() {
		return exp;
	}

	public void setExp(Date exp) {
		this.exp = exp;
	}

	public HashMap<String, Integer> getNutriFact() {
		return nutriFact;
	}

	public void setNutriFact(HashMap<String, Integer> nutriFact) {
		this.nutriFact = nutriFact;
	}

}
