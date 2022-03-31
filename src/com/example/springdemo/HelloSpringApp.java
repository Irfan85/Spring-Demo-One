package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the Spring configuration file. This will create the Spring container for us that will hold the beans. This
		// container is also called the "Application Context"
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve beans from the Spring container. Here spring will produce the objects itself based on our given configuration
		// using its object factory. This process is known as the "Inversion of control" as the program itself is deciding when to craete which objects by itself
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Do whatever we want with the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context when we are done
		context.close();
		
	}

}
