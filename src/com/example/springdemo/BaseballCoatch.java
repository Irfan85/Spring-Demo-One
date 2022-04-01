package com.example.springdemo;

public class BaseballCoatch implements Coach {
	// Dependencies as private fields
	private FortuneService fortuneService;
	
	// Dependencies will be passed as constructor arguments
	public BaseballCoatch(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
