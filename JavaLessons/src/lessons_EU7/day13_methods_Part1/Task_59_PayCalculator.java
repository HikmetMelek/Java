package lessons_EU7.day13_methods_Part1;

public class Task_59_PayCalculator {

	public static void main(String[] args) {
		
		payCalculator(8,52.50);
		payCalculator(40, 80);
		
	}

	public static void payCalculator(double hour, double hourlyPay) {
		
		double totalPay=hourlyPay*hour;	
		System.out.println("Total pay is = "+ totalPay);	
		
	}
	
	
}
