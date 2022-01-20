package sundayReview.sundayWeek4_17102021;

public class Circle {

	// attributes: radius
		// actions/methods: area():r*r*Pi  ,  perimeter():2*r*Pi 

		public double radius; // also variables can have accessModifier like methods
		
		double Pi = 3.14; //  Math.PI  comes from Java Language Library
		
		public double area() {         // no static keyword, they are instance Methods
			double area=radius*radius*Pi;
			return area;
		}
		
		public double perimeter() {
			return 2*radius*Pi;
		}	
	
		// toString() method
		
		public String toString() {
			return "Radius: "+radius
					+ ", Area: "+ area()
					+ ", Perimeter: "+ perimeter();
		}
	
}
