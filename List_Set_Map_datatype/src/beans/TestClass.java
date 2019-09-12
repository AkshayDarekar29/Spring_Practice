package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
		Student s=(Student)ac.getBean("studentBean");
		s.showList();
		s.showSet();
		s.showMap();
		s.showProp();
	}

}
