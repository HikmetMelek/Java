package sundayReview.sundayWeek8_28112021;

public class Microsoft_R03 {

	public static void main(String[] args) {
		// i want to create an array. So i can create an object of array with two way;
		Employee_R03 person= new Employee_R03("Melek", "SDET", 200_000, 852456); // one by one create an object
		Employee_R03 person2= new Employee_R03("Merve", "SDET", 150_000, 852);
		
		Employee_R03 [] testers= { // or create in {} array
				person,
				new Employee_R03("Eyub", "SDET", 100_000, 10), // this is created as an object
				new Employee_R03("Vasilica", "ScrumMaster", 120_000, 5),
				person2,
				new Employee_R03("Selena", "QA", 185_000, 12)
				
		};
		
		double minSalary= Double.MAX_VALUE;
		double maxSalary= Double.MIN_VALUE;
		
		String personWhoMakesMax="";
		String personWhoMakesMin="";
		
		for (Employee_R03 each: testers ) {
			if(each.salary> maxSalary) {
				maxSalary=each.salary;
				personWhoMakesMax=each.name;
			}
			if(each.salary<minSalary) {
				minSalary=each.salary;
				personWhoMakesMin=each.name;
			}
		}
		System.out.println(personWhoMakesMax+" makes max salary "+ maxSalary);
		System.out.println(personWhoMakesMin+" makes min salary "+ minSalary);
		
	}

}
