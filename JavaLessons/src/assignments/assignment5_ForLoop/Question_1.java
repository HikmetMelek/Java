package assignments.assignment5_ForLoop;

public class Question_1 {

	public static void main(String[] args) {
		// Write a for loop that displays the following set of numbers:
		//0,10,20,30,40,50,...1000

		System.out.print(0);
		
		for (int i=10; i<=1000; i+=10) { 
		
			System.out.print(","+i);
			
		}								
		
	}

}
