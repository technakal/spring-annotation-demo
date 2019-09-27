package com.technakal.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationDemo {

	public static void main(String[] args) {
		// create context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get beans
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);
		
		// use bean methods
		
		
		// close context
		context.close();
		
	}

}
