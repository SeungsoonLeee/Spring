package com.lee.sdi.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class SDIMain {

	public static void main(String[] args) {

		DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(dlbf);
		xbdr.loadBeanDefinitions(new ClassPathResource("beans.xml"));

		// 처음 불러올 때에 객체를 생성한다.
		// 사실상 dlbf.getBean()은 .xml에 만들어 놓은 객체를 불러올 뿐이지 생성한다는 의미는 아니다.
		Human h = dlbf.getBean("h", Human.class);
		Human h2 = dlbf.getBean("h", Human.class);
		// 따라서 h에서 처음 객체를 생성 후 h2는 같은 객체를 불러오기만 함. 즉, h == h2
		
		System.out.println(h);
		System.out.println(h2);
		
		//beans에서 객체를 불러오는 방법이 이 방법 말고도 다른 방법이 있다.
		//Main2에서 계속...
		
		System.out.println("------------------------------------------------------");
		Human h22 = dlbf.getBean("h2", Human.class);
		System.out.println(h22.getName());
		System.out.println(h22.getAge());
		System.out.println("------------------------------------------------------");
		Human h33 = dlbf.getBean("h3", Human.class);
		System.out.println(h33.getName());
		System.out.println(h33.getAge());
		System.out.println();
		
		Monster m = dlbf.getBean("m", Monster.class);
		System.out.println(m.getName());
		System.out.println(m.getAge());
		Monster m2 = dlbf.getBean("m2", Monster.class);
		System.out.println(m2.getName());
		System.out.println(m2.getAge());
		
	}

}
