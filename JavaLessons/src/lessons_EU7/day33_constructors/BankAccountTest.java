package lessons_EU7.day33_constructors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String input;// local variable
		System.out.println("What is your starting balance?");
		input=sc.next();
		
		BankAccount account= new BankAccount(input);// you can use "sc.next();" directly in ()
		
		System.out.println("How much were you paid this month?");
		input=sc.next();
		account.deposit(input);
		
		System.out.println("Your pay has been deposited.Your current balance is: "+ account.getBalance());

	}

}
