package replit.loops;

import java.util.Scanner;

public class ShoppingList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double price = 0;
		double totalPrice = 0;
		int count = 1;
		String shoppingListReport="" ;
		String countinue;
		String item;
		
		do {
			
			System.out.println("Enter Item"+count+" and its price:");
			item = scan.nextLine();
			price= scan.nextDouble();
			totalPrice= totalPrice+price;
			System.out.println("Add one more item?");
			countinue = scan.next();
			if(count!=1) shoppingListReport += ", "+"Item"+count+": "+item+ " Price: "+ price;
			else shoppingListReport= "Item"+count+": "+item+ " Price: "+ price;
			count++;
			scan.nextLine();
		}while(countinue.equals("yes"));
		
		System.out.println(shoppingListReport);
		System.out.println("Total Price: "+ totalPrice);
		scan.close();
	}

}
