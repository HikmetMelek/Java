package lessons_EU7.day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker1{

	public static void main(String[] args) {
		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of 
		//change
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number from 1-99: "); 
		int userNumber= scan.nextInt();
		
		if (userNumber>1 && userNumber<100)	{
			changeMaker(userNumber);
		}
		else System.out.println("Invalid Data");
		
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
