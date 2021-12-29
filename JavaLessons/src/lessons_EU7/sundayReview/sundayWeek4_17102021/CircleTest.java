package lessons_EU7.sundayReview.sundayWeek4_17102021;

public class CircleTest {

	public static void main(String[] args) {

//		Syntax:   ClassName objectName = new ClassName();
		
			lessons_EU7.sundayReview.sundayWeek4_17102021.Circle circle1 = new lessons_EU7.sundayReview.sundayWeek4_17102021.Circle();
			
			System.out.println(circle1.radius);
			
			circle1.radius = 5.0;
			System.out.println(circle1.area()); // I call the methods with the object name
			System.out.println(circle1.perimeter());
			
			lessons_EU7.sundayReview.sundayWeek4_17102021.Circle circle2 = new lessons_EU7.sundayReview.sundayWeek4_17102021.Circle();
			circle2.radius=10.0;
			System.out.println(circle2.area());
			System.out.println(circle2.perimeter());
			
			System.out.println("-----------------------------");
		//	System.out.println(circle1); // the address of the reference variable in the Stack Memory
			
			System.out.println(circle1.toString());
			
		}

}
