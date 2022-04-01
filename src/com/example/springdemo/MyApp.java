package com.example.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach baseballCoatch = new BaseballCoatch(new HappyFortuneService());
		System.out.println(baseballCoatch.getDailyWorkout());
		
		Coach trackCoach = new TrackCoach(new HappyFortuneService());
		System.out.println(trackCoach.getDailyWorkout());
		
	}
}
