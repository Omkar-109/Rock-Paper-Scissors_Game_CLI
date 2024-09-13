package com.game;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Move m=new Move();
		System.out.println("Do you want to play a game? (1 for yes)");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		if(n==1) {
			System.out.println("\n\n");
			m.LetsPlay();	
		}
			
		
	}
}
