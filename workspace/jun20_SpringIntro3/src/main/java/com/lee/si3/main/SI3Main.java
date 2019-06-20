package com.lee.si3.main;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class SI3Main {
	public static void main(String[] args) {
		// Spring은 객체를 .xml에 만든다.
		// 자바에서는 그 객체를 불러다 사용
		// 객체를 생성하는 방법은 아래와 같다.
		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dlbf);
		xbdr.loadBeanDefinitions(new ClassPathResource("chracters.xml"));

		// 불러온 객체를 사용하는 방법은 아래와 같다.
		Avengers a = dlbf.getBean("h", Avengers.class);
		a.attack();

		
		// 용어
		// DI(Dependency Injection)
		// 객체를 만들고, 값 넣고, ...
		// 쉽게 말해서 그냥 객체를 만들어서 사용한다는 의미
		
		// IoC(Inversion of Control)
		// 파일로 프로그램을 제어
		
		// Spring은 xml파일로 객체를 만들어 프로그램을 제어 한다 즉, IoC로 DI를 하는 것.
		
		
		// 기존 자바에 있는 date객체도 사용 가능
		Date d = dlbf.getBean("d", Date.class);
		System.out.println(d);
	}
}
