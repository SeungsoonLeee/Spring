package com.lee.sdi.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SDIMain2 {

	public static void main(String[] args) {

		// dlbf 방식 말고
		// beans에서 객체를 불러오는 2번째 방법. aac 방식
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");

//		Human h = aac.getBean("h", Human.class);

		// 둘의 차이점은 aac방식은 ClassPathXmlApplicationContext()에서 등록된 객체들을 모두 생성한다.
		// 객체가 생성되는 타이밍 자체가 다름(사용하지 않더라도 다 불러온다)

		// 2번째 방법의 문제점은 메모리관리!
		// 객체를 Human h = ... 으로 등록하지 않더라도 생성되어 있기 떄문에 프로그램이 종료되어도 메모리상에 계속 남게된다.
		// 따라 aac가 없어질 때 그곳에 등록된 객체들도 같이 없어지도록 해주어야함.
		aac.registerShutdownHook();
		
		//그리고 더이상 aac를 더이상 사용하지 않을 떄에는 close하여 aac를 없애준다.
		aac.close();
	}

}
