package com.lee.myFirstApp.calculate;

//요청 파라메터명 == 멤버 변수명   -> 자동으로 매핑하여 값을 가져옴
public class XY {
	private int x;
	private int y;

	public XY() {
	}

	public XY(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
