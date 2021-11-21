package replit.arrays;

import java.util.*;

public class Diving {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter your score(total will be 7)");
		 float[] score = new float[7];
		
		 for(int i=0 ;i<score.length;i++) {
		    System.out.println("Enter score for judge "+(i+1)+":");
			score[i]=input.nextFloat();
		 }

		 float total=0f;
		 float max=score[0];
		 float min=score[0];

		 for(float i: score) {
			 total+=i;
			 if(i>max)
				 max=i;
			 else if(i<min)
				 min=i;
		 }
		 
		 System.out.println("Enter difficulty:");
		 float difficultyNum= input.nextFloat();
		 
		 total=(total-max-min)*difficultyNum*0.6f;
		 
		 // FINAL OUTPUT
		 System.out.printf("Total: %.2f", total);
	}

}
