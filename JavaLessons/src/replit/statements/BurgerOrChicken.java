package replit.statements;

import java.util.Scanner;

public class BurgerOrChicken {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter Meal");
		 String in = s.next();
		 double price;
		 
		 if (in.equals("burger")|| in.equals("chicken")) {
			 price=10.0;
			 System.out.println (in);
			 System.out.println(price);
		 }
		 else if (in.equals("soda")) {
			price=2.0;
			System.out.println(in);
			System.out.println(price);
		}
		 else if (in.equals("fries")) {
				price=3.5;
				System.out.println(in);
				System.out.println(price);
		}
		
		
			  
	}

}
