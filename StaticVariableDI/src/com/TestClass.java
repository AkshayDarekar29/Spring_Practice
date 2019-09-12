package com;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestClass {
	public static void main(String[] args) {
		//ClassPathResource r= new ClassPathResource("bean.xml");
		//BeanFactory obj=new XmlBeanFactory(r);
		
		ApplicationContext obj=new ClassPathXmlApplicationContext("bean.xml");
		Student s= (Student) obj.getBean("c");
		s.hello();
	}
}
