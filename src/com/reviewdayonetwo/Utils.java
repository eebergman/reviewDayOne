package com.reviewdayonetwo;

public class Utils {
	
public static boolean userYesOrNo(String userToPlayGame) {
		
		boolean continueGame =false;
		
		while (!(userToPlayGame.equalsIgnoreCase("yes") || userToPlayGame.equalsIgnoreCase("no"))) {
			continueGame = true;
			break;
		}
		return continueGame;
	}

}
