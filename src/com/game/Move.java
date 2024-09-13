package com.game;


import java.util.Scanner;
/**
 * The Move class creates objects of Player and Computer classes and lets user play the game
 * 
* @author Omkar Mhamal
 * @version 05-08-2024
 * @since 05-08-2024
 * 
 * 
 */
public class Move {

	private Player player;
	private Computer computer;
	Scanner s;
	public Move() {
	
		this.player = new Player();
		this.computer = new Computer();
	}
	
	public void LetsPlay() {
		boolean flag=true;
		do {
			System.out.println("\n+++++++++++++++++++++++++++++++++++\n\nLet's play rock paper scissors !!"+"\n-------------------------------");
			
			String p_move=player.getPlayerMove();
			String c_move=computer.getComputerMove();
			
			if(p_move.equals(c_move)) {
				System.out.println("Match tie");
				System.out.println("User: "+p_move+"\tComputer: "+c_move);
			}
			else if( (p_move.equals("rock") && c_move.equals("scissors")) 
					|| (p_move.equals("paper") && c_move.equals("rock")) 
					|| (p_move.equals("scissors") && c_move.equals("paper")) ) {
				System.out.println("User: "+p_move+"\tComputer: "+c_move);
				System.out.println("You win! :)\n");
			}
			else {
				System.out.println("User: "+p_move+"\tComputer: "+c_move);
				System.out.println("You lose! :(\n");
			}
			
			
			s=new Scanner(System.in);
			System.out.print("Press '1' to play again");
			int n=s.nextInt();
			if(n==1) {
			}
			else {
				flag=false;
				System.out.println("Thanks for playing!");
			}
		}while(flag);
	}
}
