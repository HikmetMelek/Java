package lessons_EU7.sundayReview.week10_12122021;

public class SupportPersonal extends Employee {

	public SupportPersonal(String name, String jobTitle, double salary, int age, char gender) {
		super(name, jobTitle, salary, age, gender);
		
	}

	@Override
	public void work() {
		super.work();
		//System.out.println(getName()+" is supporting everybody with their hard work");
	}

	
	
	
	
	
	
}
