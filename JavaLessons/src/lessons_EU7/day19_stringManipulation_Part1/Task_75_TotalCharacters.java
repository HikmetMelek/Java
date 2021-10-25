package lessons_EU7.day19_stringManipulation_Part1;

import java.util.Scanner;

public class Task_75_TotalCharacters {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your firstname and lastname: ");
		String name= scan.nextLine();
		System.out.println(name.length());
		System.out.println("--------------------------");
		
		System.out.print("Enter your first name:");  
		String firstName = scan.next();
		
		System.out.print("Enter your last name:");
		String lastName = scan.next();
		
		System.out.println("Total characters in your first and last name is:" +((firstName.length())+lastName.length()) );
		
	}

}
