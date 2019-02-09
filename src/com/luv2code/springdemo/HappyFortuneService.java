package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes = new String[] {
			"Today is your lucky day!", 
			"This will be a fortunate day!",
			"This day will be better than your last!"
		};
		
	Random rand = new Random();
	
	@Override
	public String getFortune() {

		return fortunes[rand.nextInt(3)];
	}

}

