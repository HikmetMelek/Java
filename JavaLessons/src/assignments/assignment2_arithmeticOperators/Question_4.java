package assignments.assignment2_arithmeticOperators;

public class Question_4 {

	public static void main(String[] args) {
		//Write a program that determines the change to be dispensed from a vending machine. 
		//An item in the machine can cost between 25 cents and 1 dollar,
		//in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100),
		//and the machine accepts only a single dollar bill to pay for the item.
		//Sample output
		//Price in cents : 95
		//Your change is 0 quarters, 0 dimes, and 1 nickels
		
		int cost=95;
		int change=100-cost;
		int quarters, dimes, nickels;
		quarters=change/25;
		dimes= change%25/10;
		nickels= change%25%10/5;
		
		System.out.println("Price in cents : "+cost);
		
		System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels");
		
		
	 

	}

}
