package lessons_EU7.day33_constructors;

public class CarClass_withSuperMethod {
	
	String model; // object
	String make;
	int year;
	double mile;
	String color;
	
	// create constructor
	public CarClass_withSuperMethod() { // no-argument cons.
		
		make = "BMW";
		model = "M3";
		year = 2019;
		mile = 23000;
		color = "red";	
	}

//	public Car(String mo, String ma, int yr, double ml,  String cl) { // parameterized constructor
//		model= mo;
//		make= ma;
//		year= yr;
//		mile= ml;
//		color= cl;
//	}
	public CarClass_withSuperMethod(String model, String make, int year, double mile, String color) { // parameterized cons.
		this.model = model; // 'this' is reference variable--> refers to current object --> this.(call some method)
		this.make = make;	
		this.year = year;	// !!! to use same name with object and argument
		this.mile= mile;
		this.color=color;
	}

	/*
	right click on page> Source> Generate Constructor using fields> select object> click Generate button
	
	public Car(String model, String make, int year) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
	}
	*/
	
}
