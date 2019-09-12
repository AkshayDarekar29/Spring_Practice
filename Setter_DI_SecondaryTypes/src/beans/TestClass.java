package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		String files[] =  new String[]{"resources/engine.xml","resources/car.xml"};
		ApplicationContext ac= new ClassPathXmlApplicationContext(files);
		Car c =(Car)ac.getBean("c");
		c.printCarDetails();
	}
}
