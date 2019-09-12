package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
			//to destroy the bean you need to either call close method of ConfigurableApplicationContext 
			//or registerShutdownHook method of AbstractApplicationContext
			//ConfigurableApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
			//ac.close();
			
			AbstractApplicationContext aac= new ClassPathXmlApplicationContext("bean.xml");
			aac.registerShutdownHook();
	}
}
