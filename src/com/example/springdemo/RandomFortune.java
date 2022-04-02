package com.example.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {
	
	private static final Random random = new Random();
	private static final String[] FORTUNES = {"Today is your lucky day.", "You have to work harder.", "Never give Up!"};
	
	@Override
	public String getFortune() {
		return FORTUNES[random.nextInt(3)];
	}
	
}
