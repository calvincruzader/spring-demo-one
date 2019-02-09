package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fs; 
	
	
	
	public TrackCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
	}
	
	// add an init method 
	public void doMyStartupStuff() { 
		System.out.println("TrackCoach: inside method doMyStartupStuff");
		
	}
	
	// add destroy method for beans
	public void doMyCleanUpStuff() { 
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
}
