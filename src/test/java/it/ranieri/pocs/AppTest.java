package it.ranieri.pocs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config/context-spring-beans.xml")
public class AppTest {

	@Autowired
	private HelloWorld helloWorld;

	@Test
	public void testOrderService() {
		helloWorld.printHello();
	}
}