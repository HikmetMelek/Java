package lessons_EU7.sundayReview.sundayWeek3_03102021;

import java.util.Scanner;

public class MaxAndMinWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number:");
		int first= input.nextInt();
		
		int max= first;
		int min= first;
		
		for (int i=1; i<=4; i++) {
			
			System.out.println("Enter the another number:");
			int number= input.nextInt();
			
			if (number>max) {
				max=number;
			}
			if (number<min) {
				min=number;
			}
			
		}
		
		System.out.println("Max number is "+max);
		System.out.println("Min number is "+min);
	
	}

}
