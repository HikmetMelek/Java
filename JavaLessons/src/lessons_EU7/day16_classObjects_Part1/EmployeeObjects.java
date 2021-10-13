package lessons_EU7.day16_classObjects_Part1;

public class EmployeeObjects {

	public static void main(String[] args) {
		
		Employee person1= new Employee();
		Employee person2= new Employee();
		
		person1.name= "Mike P";
		person1.jobTitle="SDET";
		person1.salary= 2500.1;
		
		person2.salary=1500;
		
		double sumSalary= person1.salary+ person2.salary;
		
		person1.attendMeeting();
		System.out.println("Salary :"+  person1.salary);
		System.out.println(sumSalary);
		
	}

}
