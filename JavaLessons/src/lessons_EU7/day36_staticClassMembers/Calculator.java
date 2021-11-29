package lessons_EU7.day36_staticClassMembers;

public class Calculator {
	
	int x;
	
//	public Calculator() {
//		
//	}
//	
//	public Calculator(int x) {
//		this.x=x;
//	}
	
	public static double plus(double num1,double num2) { // if u do not use instance variable(x) in method, u can make it static method
		return num1+num2;
	}
	
	public static double minus(double num1,double num2) {
		return num1-num2;
	}
	
	public static double multiply(double num1,double num2) {
		return num1*num2;
	}
	
	public int m1() { // if u use instance variable(x) in method, u can not make it static method
		return x+4;
	}

	
}
