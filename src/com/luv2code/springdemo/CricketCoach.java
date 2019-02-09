package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fs; 
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() { 
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Swing 100 times a day";
	}

	@Override
	public String getDailyFortune() {
		return "CRICKET FORTUNE " + fs.getFortune();
	}
	
	public void setFortuneService(FortuneService fs) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fs = fs;
	}
}
