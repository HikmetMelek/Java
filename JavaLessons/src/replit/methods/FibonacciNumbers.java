package replit.methods;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
		int num = scan.nextInt();
		scan.close();
	    fib(num);
	    
	}

	public static void fib(int num){
		
		int number=0, secondNumber=1, totalNumber=0;
	
		for (int i=1; i<num; i++) {
			
			totalNumber= number + secondNumber;
			number= secondNumber;
			secondNumber= totalNumber;
		
			if (i==(num-1)) System.out.println(totalNumber);
			
		}
			
	}
	
}
