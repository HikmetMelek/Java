package lessons_EU7.day23_stringManipulationLab_randomClasss;

import java.util.*;

public class Task_85_DiceGame {

	public static void main(String[] args) {
		
		int computerWin=0;
		int userWin=0;
		int computerDice=0;
		int userDice=0;
		Random rn = new Random();
		
		for (int i=1; i<=10; i++) {
		
			userDice= rn.nextInt(6)+1;
			computerDice= rn.nextInt(6)+1;
			
			if (userDice> computerDice)  
				userWin++;
			else if (computerDice> userDice) 
				computerWin++;
			
		}
			if (userWin> computerWin) {
				System.out.println("User: "+ userWin+ "\nComputer: "+ computerWin+ "\nWinner is User");
			}
			else if (computerWin> userWin) {
				System.out.println("User: "+ userWin+ "\nComputer: "+ computerWin+ "\nWinner is Computer");
			}
			else System.out.println("Computer: "+ computerWin+ " User: "+ userWin+ "\nIn case of a tie, there is no winner");			
			
	}

}
