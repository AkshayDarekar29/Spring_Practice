package beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext c = new ClassPathXmlApplicationContext("resources/beans.xml");
		
		c.start();
		c.stop();
		c.refresh();
		c.close();
		c.start();
		
	}
}
