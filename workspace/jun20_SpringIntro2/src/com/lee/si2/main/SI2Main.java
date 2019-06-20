package com.lee.si2.main;

//처음에 인터페이스로 구현할 코드 내용을 제시
public class SI2Main {
	public static void main(String[] args) {

		Avengers a = new Ironman(); //Hulk();
		
		//헐크에서 아이언맨으로 수정시 java코드 1줄 수정으로 줄어들었지만
		//어찌됐든 java코드 자체를 수정해야 함.
		a.attack();

		//진짜 Spring을 도입하는 방법으로
		//SpringIntro3에서 계속...
	}
}
