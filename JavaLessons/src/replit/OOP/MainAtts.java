package replit.OOP;

import java.util.Scanner;

public class MainAtts {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data: ");
		Atts a = new Atts();
		a.name = input.nextLine();
		a.color = input.nextLine();
		a.amount = input.nextInt();
		
		a.asString();
		
	
		   
	input.close();
		
	}
	
}
