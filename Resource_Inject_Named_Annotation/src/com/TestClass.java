package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		Car s= (Car) ac.getBean("car2");   //by default id will be car
		s.printCarDetails();
	}
}
