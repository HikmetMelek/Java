package replit.variables;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter Item1 : ");
		String item1= scan.nextLine();
		System.out.println("Enter Item1 price: ");
		double price1= scan.nextDouble();
		
		System.out.println("Enter Item2 : ");
		scan.next();
		String item2= scan.nextLine();
		System.out.println("Enter Item2 price: ");
		double price2= scan.nextDouble();
		
		System.out.println("Enter Item3 : ");
		scan.next();
		String item3= scan.nextLine();
		System.out.println("Enter Item3 price: ");
		double price3= scan.nextDouble();
		
		//System.out.println("Total price: "+ (price1+price2+price3));
		


	}

}
