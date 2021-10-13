package lessons_EU7.day18_readingUserInput;

import java.util.Scanner;

public class Task73_GuessingGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number between 1-20:");
		int num=scan.nextInt();	
		int secretNum=16;
		
		do {
			if (num<1 || num>20) {
				System.out.println("Invalid number");
				System.out.print("Enter a number between 1-20:");
				num=scan.nextInt();	
			}
			
			else if (num<secretNum) {
				System.out.print("Enter bigger number:");
				num=scan.nextInt();	
			}
			else if (num>secretNum) {
				System.out.print("Enter smaller number:");
				num=scan.nextInt();	
			} 
			
		}while(num!=secretNum);
		
		System.out.print("Congrat you got it...");
		
		scan.close();
	}
	// OZZY RESULT;
//	int userInput;
//	int secretNumber=8;
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("Enter number:");
//	
//	do {
//		userInput=sc.nextInt();
//		
//		if(userInput<secretNumber) {
//			System.out.print("Enter a bigger number:");
//		}else if(userInput>secretNumber) {
//			System.out.print("Enter a smaller number:");
//		}else {
//			System.out.print("Congrat you got it...");
//		}
//		
//	}while(userInput != secretNumber);
				
}
