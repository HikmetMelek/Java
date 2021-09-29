package replit.statements;

import java.util.Scanner;

public class VehicleRecall {

	public static void main(String[] args) {
		
		int year;
		Scanner sc= new Scanner(System.in);
		year=sc.nextInt();
		
		switch(year){
		case 1995: case 1996: case 1997: case 1998:case 2001: case 2002:case 2004: case 2005: case 2006:case 2015: case 2016: case 2017:
			System.out.println("Your vehicle needs to be recalled!");	
		 break;
		default:
			System.out.println("Your vehicle is fine, enjoy!");		
		
			
		}

	}

	
		
}


