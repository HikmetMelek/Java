package assignments.assinment6_NestedForLoop_ExtraSpicy;

import java.security.Principal;

public class SpicyQuestion_6 {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//
//		1
//		2 6
//		3 7 10
//		4 8 11 13
//		5 9 12 14 15
		
		int x=5;
		
		for (int i=1; i<=x; i++) {
			
			int print=i;
			
			System.out.print(print + " ");
			
			for (int j=2; j<=i; j++) {	
				
				int difference= (x+1)-j;
				
				print= print + difference;
						
				System.out.print(print +" ");
					
			}
				System.out.println();
		}
		
	}

}
