package lessons_EU7.day07_controlFlowStatements_Part1;

import java.util.Scanner;

public class Task28_RevenueWithScanner {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter product price= ");
		double price= scan.nextDouble();
		
		System.out.println("Enter product quantity= ");
		int quantity= scan.nextInt();
		
		double revenue= price*quantity;
			
		if (revenue>5000) {
			double discount=revenue*0.1;
			revenue=revenue-discount;
			System.out.println("discount is %10,");
		}
				
		System.out.println("Total Revenue is "+revenue);
		
	
		
			
			
	}

}
