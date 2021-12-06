package lessons_EU7.day38_inheritance_Part2;

public class Dog extends Animal {
	
	private int age;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int brain, int body, int size, int weight, int age, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight);
		this.age = age;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dog.chew() is called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() caled");
		chew();
		super.eat();
	}

	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(9);
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}

	public void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	
	
	
}
