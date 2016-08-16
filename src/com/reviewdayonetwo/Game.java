package com.reviewdayonetwo;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int userNumber = 0;
		int computersNumber = 0;
		boolean continueGame = false;
		String userGuess = null;

		System.out.println("Hi");

		do {

			continueGame = false;

			System.out.println("Would you like to play a game?");
			String userToPlayGame = sc.nextLine();

			continueGame = Utils.userYesOrNo(userToPlayGame);

			if (userToPlayGame.equalsIgnoreCase("Yes")) {
				System.out.println("Cool lets guess my number");
				
				computersNumber = (int) (Math.random() * 15) + 1;
				
				do {
					System.out.println("What would you like to guess?" + "\nBetween 1 and 15");
					userGuess = sc.nextLine();
					userNumber = Integer.parseInt(userGuess);
					
				} while (computersNumber != userNumber);
				
				System.out.println("Hurray!!! You guessed my number!!!");

			} else if (userToPlayGame.equalsIgnoreCase("no")) {
				System.out.println("Bye!!!");
				System.exit(0);
			}

		} while (continueGame);
		
		sc.close();
	} // main

	
	
	
	
	
	
	
	
} // class
