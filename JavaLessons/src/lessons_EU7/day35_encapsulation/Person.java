package lessons_EU7.day35_encapsulation;

public class Person {

	public String name;
	private int age; // only visible to current class
	public char gender;
	
	// setters
	public void setAge(int age) {
		if(age<0)
			System.out.println("Not valid age");
		this.age=age;
	}
	
	// getters
	public int getAge(int age) {
		return age;
	}
	
	
}
