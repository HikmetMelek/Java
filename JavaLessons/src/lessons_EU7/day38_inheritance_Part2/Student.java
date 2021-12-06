package lessons_EU7.day38_inheritance_Part2;

public class Student extends Person {

	@Override
	public void message() {
		System.out.println("This is student class");
	}

	public void display() {
		message();
		super.message();
	}
	
	
	
}
