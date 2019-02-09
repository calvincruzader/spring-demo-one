package com.luv2code.springdemo;

public class ChessCoach implements Coach {
	
	// does not have the constructor-arg defined in the bean, so the app will fail at runtime
	// because the bean associated with this class does not have the appropriate constructor 
	// that is being fed into the bean (defined in the applicationContext.

	private FortuneService fs;
	
	public ChessCoach(FortuneService theFortuneService) { 
		fs = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Play 10 games with a computer.";
	}

	@Override
	public String getDailyFortune() {
		return "this is a CHESS FORTUNE " + fs.getFortune();
	}
	
	// add an init method 
	public void doMyStartupStuff() { 
		System.out.println("ChessCoach: inside method doMyStartupStuff");
		
	}
	
	// add destroy method for beans
	public void doMyCleanUpStuffYOYO() { 
		System.out.println("ChessCoach: inside method doMyCleanUpStuffYOYO");
	}


}
