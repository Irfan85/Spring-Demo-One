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
	
	// Bean init method
	public void doStartupStuff() {
		System.out.println("TrackCoach: inside method 'doStartupStuff'");
	}
	
	// Bean destroy method
	public void doCleanupStuff() {
		System.out.println("TrackCoach: inside method 'doCleanupStuff'");
	}

}
