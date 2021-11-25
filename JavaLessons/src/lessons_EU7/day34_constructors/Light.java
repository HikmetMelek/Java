package lessons_EU7.day34_constructors;

public class Light {
	
	int noOfWatts;
	boolean indicator;
	String location;
	
	//1
	public Light() {
		this(0, false);
		System.out.println("Returning from no-arg. constructor no.1");
	}
	
	//2
	public Light(int watt, boolean ind) { // this(0, false): Light(int watt, boolean ind)
		this(watt, ind, "eX");
		System.out.println("Returning from constructor no.2");
	}
	
	//3
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constructor no.3");
	}
	
	
	
	
	
}
