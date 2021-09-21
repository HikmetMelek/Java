package replit.variables;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write hour ");
		int hour= scan.nextInt();
	    
	    System.out.println("Write minute ");
	    int minute = scan.nextInt();
	    
	    System.out.println("Write second ");
	    int second = scan.nextInt();
	    
	    System.out.println("Write \"AM\" or \"PM\"");
	    String amOrPm= scan.next();
	    
	    System.out.println(hour+":"+ minute + ":" + second+ " "+ amOrPm);
	    
	    
	    

	}

}
