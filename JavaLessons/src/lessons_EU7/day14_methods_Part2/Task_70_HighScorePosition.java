package lessons_EU7.day14_methods_Part2;

import java.util.Scanner;

public class Task_70_HighScorePosition {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score=sc.nextInt();
		
		int position=calculateHighScorePosition(score);
	
		displayHighScorePosition("Melek", position);	

	}

	public static void displayHighScorePosition(String name, int position) {
		
		System.out.println(name+" manage to get into position "+position+" on the high score table");
		
		
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if (score>=1000) return 1;
		else if (score>=500 && score<1000) return 2;
		else if (score>=100 && score<500) return 3;
		else return 4;
		
	}
	
	
}
