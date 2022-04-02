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
	
	// These init and destroy methods can have any access modifier. They must be no-arg methods 
	// If our bean's scope is prototype, Spring won't call the destroy method on that bean. We have to call 
	// it manually and manage its lifecycle by ourselves
	
	// Bean init method
	private void doStartupStuff() {
		System.out.println("TrackCoach: inside method 'doStartupStuff'");
	}
	
	// Bean destroy method
	private void doCleanupStuff() {
		System.out.println("TrackCoach: inside method 'doCleanupStuff'");
	}

}
