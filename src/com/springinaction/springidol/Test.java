package com.springinaction.springidol;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		Perfomer perfomer = (Perfomer)ctx.getBean("kenny");
		perfomer.perform();
	}

}
