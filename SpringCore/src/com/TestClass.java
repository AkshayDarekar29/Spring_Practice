package com;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestClass {
	public static void main(String[] args) {
		ClassPathResource r= new ClassPathResource("bean.xml");
		BeanFactory obj=new XmlBeanFactory(r);
		Student s= (Student) obj.getBean("studentBean");
		/*System.out.println(s.getName());
		System.out.println(s.getId());*/

		//obj.getBean("studentBean");
	}
}
