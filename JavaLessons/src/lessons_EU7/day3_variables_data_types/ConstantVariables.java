package lessons_EU7.day3_variables_data_types;

public class ConstantVariables {

	public static void main(String[] args) {
		
		double PI = 3.14;
		System.out.println("PI: " + PI);
		PI = 5;
		System.out.println("PI: " + PI);
		PI = 100;
		System.out.println("PI: " + PI);

		final double E = 2.78;
		System.out.println("E:" + E);
		//E = 5; //final variable cannot be assigned
		System.out.println("E:" + E);
		
	}

}
