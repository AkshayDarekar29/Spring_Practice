package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		Student s= (Student) ac.getBean("studentBean");
		System.out.println(s.getName());
		//System.out.println(s.getId());

	}
}
