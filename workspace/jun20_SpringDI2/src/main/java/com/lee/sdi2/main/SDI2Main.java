package com.lee.sdi2.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

// singleton : 유일한 객체, 필요할 때마다 객체를 불러 사용.
// static : 객체가 여러개인데 그 객체들이 공통 속성을 가지고 있을 때

public class SDI2Main {
	public static void main(String[] args) {
		// 가정의 달 세트, 39990, 5kg, 게장
		// 정보 출력
		
		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dlbf);
		xbdr.loadBeanDefinitions(new ClassPathResource("beans.xml"));
		
		Foodset f = dlbf.getBean("f", Foodset.class);
		System.out.println(f.getName());
		System.out.println(f.getPrice());
		System.out.println(f.getWeight());
		System.out.println(f.getProduct());
		System.out.println("--------------------------------------------------");
		// singleton
		Kimsumi k = dlbf.getBean("kim", Kimsumi.class);
		Kimsumi k2 = dlbf.getBean("kim", Kimsumi.class);
		k2.setName("이름변경");
		k.print();
	}
}
