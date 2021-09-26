package replit.statements;

import java.util.Scanner;

public class ApartmentLeasing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice= 0;
	    
	    if (numberOfBedrooms==1) startingPrice=1100;
	    if (numberOfBedrooms==2) startingPrice=1850;
	    if (numberOfBedrooms==3) startingPrice=2550;
	   	  	
	    switch (numberOfBedrooms) {
	    case 1:
	    	System.out.println("One Bedroom Selected\nStarting Price: "+startingPrice);
	    break;
	    case 2:
	    	System.out.println("Two Bedroom Selected\nStarting Price: "+startingPrice);
	    break;
	    case 3:
	    	System.out.println("Three Bedroom Selected\nStarting Price: "+startingPrice);
	    break;
	    default:
	    	System.out.println("No such Bedrooms available");
	    	
	    }
	 	   	    
	    
	}

}
//> **prices**
//> 1 bedroom - 1100
//> 2 bedroom - 1850
//> 3 bedroom - 2550
//
//
//Example Flow:
//```
//Welcome to Cybertek Apartments!
//Number of bedrooms you are interested:
//1
//One Bedroom Selected
//
//```
//
//```
//Welcome to Cybertek Apartments!
//Number of bedrooms you are interested:
//3
//Three Bedroom Selected
//Starting Price: 2550
//```
//
//```
//Welcome to Cybertek Apartments!
//Number of bedrooms you are interested:
//5
//No such Bedrooms available
//
//```
//Note: If an invalid bedroom number is given no price is displayed 