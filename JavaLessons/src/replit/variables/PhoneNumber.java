package replit.variables;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Area Code");
		int areaCode=scan.nextInt();
		System.out.println("Enter Local Number");
		int localNumber=scan.nextInt();
	    
	    String phoneNumber;
	  
	    System.out.println("Calling number " + "(" + areaCode+ ")" + "-" + localNumber);
	    

	}

}
