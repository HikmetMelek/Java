package lessons_EU7.day30_wrapperClass;

public class ParsingValues {

	public static void main(String[] args) {
		// Parsing Value:  --> convert a String to primitive.  -->  convert a primitive to String
		String numberAsString= "2018";
		System.out.println(numberAsString); // output is string
		
		int number= Integer.parseInt(numberAsString);
		System.out.println(number); // output is integer
		
		numberAsString= numberAsString + 1;
		number= number + 1;
		System.out.println(numberAsString);
		System.out.println(number);
		
		double number2= Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		int i=10;
		String s= String.valueOf(i);
		System.out.println(s);   // it will return 10
		
		String s2= Integer.toString(i);
		System.out.println(s2);  // it will return 10 as string
		

	}

}
