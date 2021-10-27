package lessons_EU7.day04_arithmetic_operators;


/* this program calculates the amount of pay that will be contributed to 
 * a retirement plan if 5%, 8% or 10% monthly pay is withheld  */



public class conribution {

	public static void main(String[] args) {
		
		double monthlyPay=6000;
		double conribution;
		
		conribution= monthlyPay*0.05;
		System.out.println("5 persent is $"+ conribution+ " per month.");
		 
		 conribution=monthlyPay*0.08;
		 System.out.println("8 persent is $"+ conribution+ " per month.");
		 
		 conribution=monthlyPay*0.10;
		 System.out.println("10 persent is $"+ conribution+ " per month.");
		 
	}

}
