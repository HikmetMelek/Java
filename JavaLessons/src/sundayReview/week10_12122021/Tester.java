package lessons_EU7.sundayReview.week10_12122021;

public class Tester extends Employee {

	public Tester(String name, String jobTitle, double salary, int age, char gender) {
		super(name, jobTitle, salary, age, gender);
		
	}

	@Override
	public void work() {
		System.out.println(getName()+" is working"); // because name is private . i only can use getter.
	}
	
	public void findBugs() {
		System.out.println(getName()+ " found bug");
	}
	
	
}
