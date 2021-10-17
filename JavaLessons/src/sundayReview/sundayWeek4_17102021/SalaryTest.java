package lessons_EU7.sundayReview.sundayWeek4_17102021;

public class SalaryTest {

	public static void main(String[] args) {
		
		Salary shevki= new Salary()	;
		
		shevki.setInfo(70,0.19,45);
		System.out.println(shevki.salaryAfterTax());
		
		Salary hande= new Salary();
		hande.setInfo(100, 0.150, 35);
		System.out.println(hande.salaryAfterTax());
		
		
		
		
	}

}
