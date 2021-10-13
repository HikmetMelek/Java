package lessons_EU7.day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker2{

	public static void main(String[] args) {
		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of 
		//change
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number from 1-99:");
		int attempt=0;
		
		do {
			
			int user_amount=scan.nextInt();
			
			if(user_amount>1 && user_amount<100) {
				changeMaker(user_amount);
				break;
			}else {
				attempt++;
				if(attempt==3) {
					System.out.println("Sorry, no more attemp");
					break;
				}else {
					System.out.print("Try again");
				}
			}
			
		}while(true);
		
		scan.close();
			
	}
	
	public static void changeMaker(int number) {
		int beginningNumber=number;
		
		int quarters=number/25;
		int dimes= number%25/10;
		int nickles= number%25%10/5;
		int pennies= number%25%10%5;
			   
		System.out.println(beginningNumber+ " is, "+ quarters+ " quarters "+ dimes+ " dimes "+ nickles+ " nickles "+
		pennies+ " pennies.");
		
	}
	
}
