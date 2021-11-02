package replit.string;

import java.util.Scanner;

public class SMSMessage {

	public static void main(String[] args) {
		// Given a String message in the following format: 
		// Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving} 
		// assign the value of the sender, phoneNumber, and messageBody variables and print them.
		
		/*Sender: Mike Smith
		Phone Number: 202-123-3456
		Message body: I love programing and problem solving */
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String sender;
		String phoneNumber;
		String messageBody=message;
		
		sender= message.substring(message.indexOf("<")+1, message.indexOf(">"));
		phoneNumber= message.substring(message.indexOf("[")+1, message.indexOf("]"));
		messageBody= message.substring(message.indexOf("{")+1, message.indexOf("}"));
		System.out.println("Sender: "+ sender+"\nPhone Number: "+ phoneNumber+ "\nMessage body: "+ messageBody);
		
		
	}

}
