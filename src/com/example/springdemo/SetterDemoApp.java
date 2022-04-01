package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load IoC configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Fetch beans
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Do something with the beans
		System.out.println(myCricketCoach.getDailyWorkout());
		System.out.println(myCricketCoach.getDailyFortune());
		
		System.out.println(myCricketCoach.getEmailAddress());
		System.out.println(myCricketCoach.getTeam());
		
		// Exit the container when we're done
		context.close();

	}

}
