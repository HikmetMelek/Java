package lessons_EU7.day13_methods_Part1;

public class PassArgImportant {

	public static void main(String[] args) {
		
		int x=10;
		
		displayValue(10);
		displayValue();
		displayValue(x);
		displayValue(x*4);
		displayValue(3, 5.3);
		displayValue(7,8);
		
	}
	
	public static void displayValue(int num) { // variable name has to match with output (in the "System.out.println")
		
		System.out.println("The value is "+ num);
		System.out.println("The value is "+ num*2);
		System.out.println("---------------");
		
	}
	
	public static void displayValue() {
		
		System.out.println("10");
		
	}

	public static void displayValue(int num1, double num2) {
		 System.out.println(num1+"   "+ num2);
	}
	
	public static void displayValue(int num1, int num2) { // (int num1,num2) give ERROR..
		 System.out.println(num1+"   "+ num2);
	}
	
	
	
}
