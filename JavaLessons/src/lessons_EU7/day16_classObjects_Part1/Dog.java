package lessons_EU7.day16_classObjects_Part1;

public class Dog {
	
	// class is a blueprint and has common properties and methods.
	// we create a class without main method.// this only template.
	// in this class we do not have specific object (for example.: which dog?) I only have dogs' properties that will be used.
	
	String breed;
	int age;
	String color;
	String name;
	
	public void barking() {   // without main method, we can NOT use "static".
		System.out.println(name+ " is barking");
		
	}
	
	public void hungry() {
		System.out.println(name+ " is hungry");
		
	}
	
	public void sleeping() {
		System.out.println(name+ " is sleeping");
	
	}

}
