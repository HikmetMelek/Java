package lessons_EU7.day13_methods_Part1;

public class Task_58_greaterNumber {

	public static void main(String[] args) {
		
		greaterNumber();
		
	}
	
	public static void greaterNumber() {
		
		int num1=10;
		int num2=25;
		
		if (num1>num2) System.out.println(num1+" is greater ");
		else if (num2>num1) System.out.println(num2+" is greater");
		else System.out.println("numbers are equal");
		
	}
	
}
