package lessons_EU7.day13_methods_Part1;

public class LoopCallMethod {

	public static void main(String[] args) {
		
		System.out.println("HELLO from the main method");
		for (int i=0; i<4; i++) {
			displayMessage();
			System.out.println("back in the main method");
			
		}

	}

	public static void displayMessage() {
		
		System.out.println("hello from display method");
	}
	
}
