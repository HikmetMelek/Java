package replit.methods;

public class SimplePrintPattern {

	public static void main(String[] args) {
		printHollowRect(5);

	}
	
	public static void printHollowRect(int length){
		
		for(int i=1; i<=length; i++) {
			
			for(int j=1;j<=length;j++) {
			
				if (i>=2 && i<length) {
				
					if (j==1 || j==length) System.out.print("*");
					else System.out.print(" ");
				
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
			
	}
		
}
//hint: you will need to use two nested for loops, and check if its the last or first iteration of the 
//loop (so you will know what to print "*" or " ")