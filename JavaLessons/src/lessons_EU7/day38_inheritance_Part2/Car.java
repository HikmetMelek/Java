package lessons_EU7.day38_inheritance_Part2;

public class Car extends Vehicle {
	
	int maxSpeed=180;
	
	public void display() {
		System.out.println("Maximum speed is: "+ maxSpeed);
		System.out.println("Max speed: " + super.maxSpeed);
		
	}
	

}
