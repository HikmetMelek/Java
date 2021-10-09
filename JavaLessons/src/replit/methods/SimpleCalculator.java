package replit.methods;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
	plus();	
	
	}	
	
	public static void plus() {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter first number:");
	int num1= sc.nextInt();
	System.out.println("enter second number:");
	int num2= sc.nextInt();
	
	int sum= num1+num2;	
	System.out.println("result: "+sum);
	sc.close();
	}

}
