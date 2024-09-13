package com.game;

import java.util.Random;

public class Computer extends MyVariables{
	private Random random;
	
	public Computer() {
		random = new Random();
		
	}
	
	public String getComputerMove() {
		int move=random.nextInt(3);
		switch(move) {
			case 0:
				return ROCK;
			case 1:
				return PAPER;
			case 2:
				return SCISSORS;
			default:
				return "unexpected value";
		}
	}
}

