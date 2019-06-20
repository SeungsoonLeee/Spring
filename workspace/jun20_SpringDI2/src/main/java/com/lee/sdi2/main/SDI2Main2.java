package com.lee.sdi2.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SDI2Main2 {
	public static void main(String[] args) {
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");
		aac.registerShutdownHook();
		
		Foodset f = aac.getBean("f", Foodset.class);
		f.print();
		
		aac.close();
	}
}
