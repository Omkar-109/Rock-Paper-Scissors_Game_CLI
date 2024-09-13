package com.game;

import java.util.Scanner;

public class Player extends MyVariables{
	
	String player_choice;
	Scanner s;
	public Player() {
		s=new Scanner(System.in);
		this.player_choice = null;
	}
	
	public String getPlayerMove() {
		String p_input;
		boolean flag=true;
		do {
		System.out.print("Enter your move (rock, paper, scissors) : " );
		p_input = s.nextLine().toLowerCase();
		if(p_input.equals(ROCK) || p_input.equals(PAPER) || p_input.equals(SCISSORS) )  {
			flag=false;
			
		}
		else {
			System.out.println("Invalid input string");
			
		}
		}while(flag);
		
		return p_input;
	}
	
	
}
