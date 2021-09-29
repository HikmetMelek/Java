package replit.statements;

import java.util.Scanner;

public class HTTPStatus {

	public static void main(String[] args) {
		
		System.out.println("Enter status code:");
	    Scanner scan=new Scanner (System.in);
	    int status= scan.nextInt();
	    
	    switch(status) {
	    case 201:
	    	System.out.println("Created");
	    	break;
	    
	    case 304:
	    	System.out.println("Not Modified");
	    	break;
	    	
	    case 404:
	    	System.out.println("Not Found");
	    	break;
	    
	    case 500:
	    	System.out.println("Internal Server Error");
	    default:
	    	System.out.println("Invalid status code!");
	    }

	}

}
