package assignments.assignment5_ForLoop;

public class Question_11 {

	public static void main(String[] args) {
		// Print the following output using nested for loops.

//		4       3       2      1
//
//   		  3       2      1
//		
//       		  2       1
//
//            		  1

		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for (int k=5-i; k>=1; k--) {
				
				System.out.print(k+"   ");
				
			}
			System.out.println();
			System.out.println();
			
		}
			
		
	}

}
