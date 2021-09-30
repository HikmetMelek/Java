package lessons_EU7.day13_methods_Part1;

public class Task_64 {

	public static void main(String[] args) {
		
		printPattern(5);

	}

	public static void printPattern(int star) {
		
		for (int i=1; i<=star; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
}



