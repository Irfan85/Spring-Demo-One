package com.example.springdemo;

public class BaseballCoatch implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}
}
