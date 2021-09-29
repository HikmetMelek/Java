package replit.statements;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
//		        > Poor = 5%
//				> Fair = 10%
//				> Good = 15%
//				> Great = 20%
//				> Excellent = 25% 
//
//				The program should display the following information based on the user input: 
//
//				Split or No split (Yes or No)
//				Number of people entered: (number) (each person = & in output)
//				Check amount: (number)
//				Service Quality: (String)
//				Total to pay:
//				Total tip:
//				Total per person:
//				Tip per person:

		int numberPerson;
		double amount, totalAmount, totalTip, totalPerPerson, tipPerPerson;
		String serviceQuality, split;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Split:");
		split=scan.next();
			
		System.out.println("Number of people:");
		numberPerson=scan.nextInt();
			
		System.out.println("Check amount:");
		amount=scan.nextDouble();
		
		System.out.println("Service quality:");
		serviceQuality=scan.next();
					
		 totalTip= amount/numberPerson;
		 totalAmount= amount+ totalTip;
		 totalPerPerson= totalAmount/numberPerson;
		 tipPerPerson= totalTip/numberPerson;
		 
		System.out.print("Number of people entered: ");	
		for(int i=numberPerson; i>0; i--) {
			System.out.print('&');
		}
		
		System.out.println();
		System.out.println("Total to pay: "+ ( totalAmount)); 
		System.out.println("Total tip: "+ totalTip);
		System.out.println("Total per person: "+ totalPerPerson);	
		System.out.println("Tip per person: "+ tipPerPerson);
		
		
		
		
		
		
	}

}
