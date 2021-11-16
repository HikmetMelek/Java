package lessons_EU7.day30_wrapperClass;

public class MathClass {

	public static void main(String[] args) {
		
		double result= Math.pow(4.0, 3.0); // 4*4*4:64
		System.out.println(result);
		
		double result2= Math.sqrt(25.0);
		System.out.println(result2);
		
		final double PI= Math.PI;
		System.out.println(PI);
		System.out.println(Math.round(PI));
		System.out.println("------------------------");
		System.out.println(Math.round(4.6));
		System.out.println(Math.floor(4.6)); // roll down
		System.out.println(Math.ceil(4.2)); // roll up
		
	}

}
