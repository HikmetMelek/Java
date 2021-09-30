package lessons_EU7.day13_methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {
		
		showSum(5,10);
		showSum(50,20);
		showSum(60,500);
	}

	public static void showSum(int num1, double num2) { // try with put "int" instead of "double"..
													
		System.out.println(num1+num2);
	}
	
	
}



