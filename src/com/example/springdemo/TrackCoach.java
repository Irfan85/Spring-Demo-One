package com.example.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		return "Keep goin on, " + fortuneService.getFortune();
	}
	
	// These init and destroy methods can have any access modifier
	// Bean init method
	private void doStartupStuff() {
		System.out.println("TrackCoach: inside method 'doStartupStuff'");
	}
	
	// Bean destroy method
	private void doCleanupStuff() {
		System.out.println("TrackCoach: inside method 'doCleanupStuff'");
	}

}
