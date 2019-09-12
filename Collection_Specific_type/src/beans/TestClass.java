package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestClass {
	public static void main(String[] args) {
		//ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
		ClassPathResource r= new ClassPathResource("resources/spring.xml");
		BeanFactory ac= new XmlBeanFactory(r);
		Test s=(Test)ac.getBean("s");
		s.printData();
	}

}
