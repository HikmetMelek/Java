package lessons_EU7.day4_arithmetic_operators;

// Write a Java program that displays the area and perimeter of a circle that has a radius of 10 using the following formulas:
// perimeter = 2 * radius * 𝜋
// area = radius * radius * 𝜋

public class task16_PI {

	public static void main(String[] args) {
		
		double area, perimeter, radius=10;
		
		final double PI=3.14;
		
		perimeter=2*radius* PI;
		area= radius*radius*PI;

			System.out.println("area of a circle is "+ area);
			System.out.println("perimeter of a circle is "+ perimeter);
	 
	String pi= "\u03c0";
		System.out.println(pi);
	
	
	}

}
