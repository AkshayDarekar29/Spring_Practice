package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
		Student s=(Student)ac.getBean("studentBean");
		System.out.println("primitive Array");
		s.displayHobbies();
		System.out.println("Secondary Array");
		s.displayGFList();
	}

}
