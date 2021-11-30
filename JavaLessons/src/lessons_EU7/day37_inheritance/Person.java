package lessons_EU7.day37_inheritance;

public class Person {
	
	public String name; // public variable
	int age;  // default variable
	char gender;
	
	public void eat(String food) {
		System.out.println(name+" is eating "+ food);
		
	}
	
	public void walk() {
		System.out.println(name+ " is walking");
	}
	
	public void eat(int hours) {
		System.out.println(name+" is sleeping for  "+ hours+  hours);
		
	}
	
	
	
	

}
