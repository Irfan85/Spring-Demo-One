package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeDemo-applicationContext.xml");
		
		// If 'myCoach' is a singleton bean, both of these beans below will refer to the same object in the memory. if it's a
		// prototype bean, they will be different objects.
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Checking if both of the objects are the same
		boolean isSame = (theCoach == alphaCoach);

		System.out.println("Is pointing to the same object: " + isSame);
		
		System.out.println("Memory location for 'theCoach'" + theCoach);
		
		System.out.println("Memory location for 'alphaCoach" + alphaCoach);
		
		// Closing the context
		context.close();
	}

}
