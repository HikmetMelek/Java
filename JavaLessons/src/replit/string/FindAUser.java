package replit.string;

import java.util.Scanner;

public class FindAUser {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 String user1= "Max Payne";
		 String user2= "Alan Wake";
		 
		 System.out.println("Enter full name:");
		 String userInput= scan.nextLine();

		 if (userInput.equalsIgnoreCase(user1) || userInput.equalsIgnoreCase(user2))
			 System.out.println("User found!");
		 else System.out.println("User not found!");

	}

}
