package replit.statements;

import java.util.Scanner;

public class ConditionalStatementPractice3 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	String name = inp.nextLine();
//	  	If name is equal to "Chen", print "teacher"
//	  	For any other input, print "student"
		switch (name) {
		case "Chen":
			System.out.println("teacher");
			break;
		default:
			System.out.println("student");
		}
	  	
	  	
	  	
	}

}
