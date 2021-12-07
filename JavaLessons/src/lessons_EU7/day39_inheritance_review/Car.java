package lessons_EU7.day39_inheritance_review;

public class Car extends Vehicle {
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear=currentGear;
	}
	
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity():Velocity "+ speed+ " direction "+ direction);
		//move(speed, direction); // jvm call child method.becouse there is override.
		super.move(speed, direction); //--> jvm call move() in parent class(Vehicle class)
	}

	@Override
	public void move(int velocity, int direction) {
		setCurrentDirection(direction+10);
		setCurrentVelocity(velocity+10);
		System.out.println("Vehicle.move():Moving at "+ getCurrentDirection()+ " in direction "+ getCurrentDirection());
		
	}
	
	
	
	

}
