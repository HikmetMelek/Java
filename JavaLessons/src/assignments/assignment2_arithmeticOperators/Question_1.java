package assignments.assignment2_arithmeticOperators;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		//Write a program to convert gallons into Liters and display it.
        //Sample output:
		//15 gallon is 56.7812 liter
		
		int gallon;
		double liter;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter gallon quantity:");
		gallon=sc.nextInt();
		
		liter= gallon*3.76;
		System.out.println(gallon+" gallon is "+liter);
					
	}

}
