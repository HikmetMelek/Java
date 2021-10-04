package lessons_EU7.day15_methods_Part3;

import java.util.Scanner;

public class Task_70_HighScore {

public static void main(String[] args) {
	// OZZY RESULT:
		int x = calculateHighScorePosition(500);
		
		displayHighScorePosition("Mike", x);

		displayHighScorePosition("Tom", calculateHighScorePosition(500));
	}
	
	public static void displayHighScorePosition(String playerName,int highScorePosition) {
		
		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
		
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		
			if(playerScore>=1000) {
				return 1;
			}else if(playerScore>=500 && playerScore<1000) {
				return 2;
			}else if(playerScore>=100 && playerScore<500) {
				return 3;
			}else {
				return 4;
			}
	}
	
	
}
