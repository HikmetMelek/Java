package replit.statements;

import java.util.Scanner;

public class Nums {

	public static void main(String[] args) {
//		Check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:
//
//			```
//			Enter 2 numbers:
//			10
//			10
//
//			10 and 10 are equal
//			```
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter 2 numbers:");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
		
		if (num1==num2) System.out.println(num1+" and "+num2+ " are equal");
		else if (num1>num2) System.out.println(num1+" is greater than "+num2);
		else System.out.println(num2+" is greater than "+num1);
		
	}

}
