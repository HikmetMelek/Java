package lessons_EU7.day37_inheritance;

public class CompanyTest_Person_Employee_Classes {

	public static void main(String[] args) {
		
		Employee emp1= new Employee();
		
		emp1.name="Melek";
		emp1.jobTitle="SDET";
		emp1.age=41;
		emp1.gender='F';
		
		emp1.work();
		emp1.eat("SALAD");
		
		// emp1.attendClass(); --> error
		// emp1 can only have everything from Person Class and whatever inside the Employee Class
					

	}

}
