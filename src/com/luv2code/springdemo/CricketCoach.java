package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fs; 
	
	@Override
	public String getDailyWorkout() {
		return "Swing 100 times a day";
	}

	@Override
	public String getDailyFortune() {
		return "CRICKET FORTUNE " + fs.getFortune();
	}
	
	public void setFortuneService(FortuneService fs) {
		this.fs = fs;
	}
}
