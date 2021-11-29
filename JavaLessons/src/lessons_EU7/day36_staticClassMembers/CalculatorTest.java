package lessons_EU7.day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		double result= Calculator.plus(55, 7); // static way, u can call static method directly with class name
		System.out.println(result);
		
		Calculator c= new Calculator();
		System.out.println(c.plus(55, 7)); // another way to call static method
		
		int i= Integer.parseInt("33");
		System.out.println(i+3);
		System.out.println(Character.isDigit('5'));
		
		//1
		CalculatorTest.mA();
		//2
		CalculatorTest ct = new CalculatorTest();
		ct.mA();
		//3
		mA();

		System.out.println(c.m1());// null value:0--> x=0+4;// m1(): non-static method.So u can not call it with class name.
									// only u can call it with an object.

	}
	
		public static void mA() {
			System.out.println("Hello");
		}
	
	
	

}
