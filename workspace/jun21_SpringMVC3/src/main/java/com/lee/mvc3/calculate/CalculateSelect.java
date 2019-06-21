package com.lee.mvc3.calculate;

import java.util.ArrayList;

public class CalculateSelect {
	private ArrayList<String> op; // +, -, *, / 중 골라 쓸 수 있도록

	public CalculateSelect() {
		// TODO Auto-generated constructor stub
	}

	public CalculateSelect(ArrayList<String> op) {
		super();
		this.op = op;
	}

	public ArrayList<String> getOp() {
		return op;
	}

	public void setOp(ArrayList<String> op) {
		this.op = op;
	}

}
