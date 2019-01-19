package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) { 
		
		// load spring config file, loading a spring application context
		// this will give us freedom to declare whatever object we want to run in this app, changing
		// only the application context whenever we want to change what this app is doing!
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		// note that the object was created (the specific subclass is created and was defined in the applicationContext)
		// this subclass also was injected an object into its constructor, also defined in its 
		// bean in the application context
		// we get the BEAN FULLY ASSEMBLED LOL 
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call the methods that were injected in the constructor in the bean
		System.out.println(theCoach.getDailyFortune());
		
		
		// close the context
		context.close();
	}
}
