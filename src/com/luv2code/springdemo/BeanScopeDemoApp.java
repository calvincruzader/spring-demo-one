package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// LOAD spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they're the same 
		boolean result = theCoach == alphaCoach;
		
		System.out.println("\nPoint to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for theCoach: " + alphaCoach);
		
		// close context
		context.close();
	}

}
