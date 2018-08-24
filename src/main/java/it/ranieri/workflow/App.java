package it.ranieri.workflow;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config/context-spring-beans.xml");

		try {
			
			HelloWorld obj = (HelloWorld) context.getBean("helloBean");
			obj.printHello();
			
		} finally {
			context.close();
		}
	}
}
