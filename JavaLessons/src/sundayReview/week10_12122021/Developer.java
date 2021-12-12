package lessons_EU7.sundayReview.week10_12122021;

public class Developer extends Employee {

	public Developer(String name, String jobTitle, double salary, int age, char gender) {
		super(name, jobTitle, salary, age, gender);
		
	}

	@Override
	public void work() {
		System.out.println(getName()+" is coding");
		super.work();
	}
	
	public void fixBugs() {
		System.out.println(getName()+ " is crying about bug");
	}
	
	
	
	
	
	
	

}
