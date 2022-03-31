package com.example.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach baseballCoatch = new BaseballCoatch();
		System.out.println(baseballCoatch.getDailyWorkout());
		
		Coach trackCoach = new TrackCoach();
		System.out.println(trackCoach.getDailyWorkout());
		
	}
}
