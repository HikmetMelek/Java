package lessons_EU7.day39_inheritance_review;

public class Vehicle {
	
	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;
	
	/*
	public Vehicle() { // no arg. cons.
		this("BMW","4DR",60,50);
	}
	*/
	public Vehicle(String name, String size) {
		this.name = name;  // this --> represent current object
		this.size = size;
		this.currentVelocity=0;
		this.currentDirection=0;
	}

	public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.currentDirection = currentDirection;
	}
	
	public void steer(int direction) {
		this.currentDirection+=direction;
		System.out.println("Vehicle.sterr():Steering at "+ currentDirection+ " degrees.");
	}
	
	public void move(int velocity, int direction) {
		this.currentDirection= direction;
		this.currentVelocity= velocity;
		System.out.println("vehicle.move():Moving at "+ currentVelocity+ " in direction "+ currentDirection);
	}

	public void stop() {
		this.currentVelocity=0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	
	public int getCurrentDirection() {
		return currentDirection;
	}
	
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	
	
	
	
	

}
