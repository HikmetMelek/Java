package assignments.assignment2_arithmeticOperators;

public class Question_2 {

	public static void main(String[] args) {
		// Write a Java program that displays the area of a rectangle 
		//with a width of 4.5 and a height of 7.9 using the following formula:
		//area = width * height

		double width=4.5;
		double height=7.9;
		double area= width*height;
		
		System.out.println("Rectangle area is: "+area);
		System.out.printf("Rectangle area is: "+ "%.2f \n", area);
		System.out.printf("Rectangle area is: "+ "%.1f \n", area);
		System.out.printf("Rectangle area is: "+ "%.0f", area);
		
	}

}
