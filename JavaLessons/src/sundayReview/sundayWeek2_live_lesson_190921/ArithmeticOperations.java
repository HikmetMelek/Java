package sundayReview.sundayWeek2_live_lesson_190921;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		double n1=8.0;
		double n2=2;
		System.out.println(n1/n2);
		
		int num1=10;
		double num2=3.0;
		int result= (int) (num1/num2);
		System.out.println("result is " + result);
		System.out.println("********************");
		// Salary Calculation
        int hourlyRate = 60; // in dollars
        double taxRate = 0.3; //  deduct from yearly salary
        int weeklyHour = 40; 
        // you are working 48 weeks a year
        // totalTax = salary*taxrate
        // calculate how much I will make a year
        
      int salary= (48*weeklyHour)*hourlyRate;
       System.out.println("your salary before tax is "+ salary);       
      double totalTax= salary*taxRate;
      System.out.println("total tax is "+ totalTax);
      double totalSalary= salary-totalTax;
      System.out.println("Salary after tax is "+totalSalary);
		
		
	}

}
