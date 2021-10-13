package lessons_EU7.day16_classObjects_Part1;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + " is working hard" );
	}
	
	public void attendMeeting() {
		System.out.println(name+ " is attending meeting... ");
	}
	
	public void introduce() {
	
		System.out.println(" name"+ name+ jobTitle+ "salary:"+ salary);
	}
	
}
