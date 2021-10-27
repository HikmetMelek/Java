package lessons_EU7.day04_arithmetic_operators;

public class additionConcat {

	public static void main(String[] args) {

		    // Number + Number = Addition
		System.out.println(2+2);
		System.out.println(20+200);

			// Number + String / String+Number= Concatenation
		System.out.println(5+ "hello");
		 	
			// String+Boolean= Concatenation
		System.out.println("hello "+true);
		
			// String+String: Concatenation
		System.out.println("hello"+" world");
		 	
			// Boolean+Number: WRONG, it does not work
		// System.out.println(true+1);
		
		System.out.println(2+0+3+"Cybertek"); //5Cybertek
		System.out.println("Cybertek"+2+0+5);
		System.out.println(2+0+5+"Cybertek"+2+0+5); // with no brankets (pranth)
		System.out.println(2+0+5+"Cybertek"+(2+0+1));//important difference!! with brackets(parantez)

	}

}
