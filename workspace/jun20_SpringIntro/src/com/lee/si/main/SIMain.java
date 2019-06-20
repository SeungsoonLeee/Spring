package com.lee.si.main;

public class SIMain {
	public static void main(String[] args) {
		// 헐크를 아이언맨으로 수정하려면 java 코드 자체를 바꾸어야 함.
		// Hulk h = new Hulk();
		// h.attack();
		
		//이러한 번거로움을 최소화하기 위해 Spring 이용.
		// java프로젝트 SpringIntro2에서 계속...

		Ironman i = new Ironman();
		i.attack();
	}
}
