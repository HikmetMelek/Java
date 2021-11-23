package lessons_EU7.day33_constructors;

public class Rectangle_ExampleOfConstrructor {
	
	double length;
	double width;
	
	public void getArea() {
		System.out.println(length*width);
	}
	
	/*
	// create constructor --> constructor having same name with class name and 
	// doesNOT have return type
	public Rectangle() { //--> no-argument constructor
		
		// instantiate(orneklendirmek) the object variables
		
	}
	*/
	public Rectangle_ExampleOfConstrructor(double a, double b) { //--> parameterized constructor
	
		length=a;
		width=b;
	
	}
	/*
	public Rectangle() {
		
		length=33.4;// it is bad concept. values are fix
		width=22.0;
	}
	*/
	
	// default constructor. if(i do not create no-argument constructor in blue-print class)
	public Rectangle_ExampleOfConstrructor() {
		//constructor do its job --> initialize the values
		//default values !!!!!!!!! (0, 0.0, null, false)
		// jvm doing this in background (if we create 'no-argument method' under main method and)
									//!!(if i do not create no-argument constructor in template class)
	}

}
