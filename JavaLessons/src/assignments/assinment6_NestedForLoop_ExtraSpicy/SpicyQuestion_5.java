package assignments.assinment6_NestedForLoop_ExtraSpicy;

public class SpicyQuestion_5 {

	public static void main(String[] args) {
//		Write a Java program to print the following pattern
//
//		1111111
//		1111122
//		1111333
//		1114444
//		1155555
//		1666666
//		7777777

		for (int i=1; i<=7;i++) { // row for
			
			for (int j=6; j>=i; j--) {	// "1" for
				System.out.print(1);
			}
			for (int k=1; k<=i; k++) { // Increasing for
				System.out.print(i);
			}
			
			System.out.println();
			
		}
		
		
	}

}
