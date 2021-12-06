package lessons_EU7.day38_inheritance_Part2;

public class CompanyTest {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		FullTimeEmployee fullTime= new FullTimeEmployee();
		Contractor cont= new Contractor();
		
		emp.calculatePay(40, 40);
		fullTime.calculatePay(40, 40);
		cont.calculatePay(40, 40);
		
		
		

	}

}
