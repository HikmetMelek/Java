package replit.string;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
	//REPLIT: Email 1
		// Swap first name with last name in the email (Seperated by an underscore). 
		// If the email doesn't contain an underscore print the given input email.
		
		Scanner s = new Scanner(System.in);
		String email= s.nextLine();	
		
		if (!email.contains("_")) System.out.println(email);
		else {
			int underScore= email.indexOf('_');
			int mailSign= email.indexOf('@');
			String name= email.substring(0, underScore);
			String lastName= email.substring(underScore+1, mailSign);
			
			System.out.println(lastName + "_" + name + email.substring(mailSign, email.length()));
		}
		
	// REPLIT:  Email 2	
		//Write a program that will print out information about user based on email. 
		// Print first name, last name, and domain. First and Last name should be printed with 
		// proper format - uppercase first letter and remaining lowercase.
		int underScore= email.indexOf('_');
		int mailSign= email.indexOf('@');
		int dot= email.indexOf('.');
		String firstName= email.substring(0, 1).toUpperCase()+ email.substring(1, underScore);
		String lastName= email.substring(underScore+1, underScore+2).toUpperCase()+email.substring(underScore+2, mailSign);
		String domain= email.substring(mailSign+1, dot);
		
		System.out.println("First name: "+ firstName);
		System.out.println("Last name: "+ lastName);
		System.out.println("Domain: "+ domain);
		
		
	}

}
