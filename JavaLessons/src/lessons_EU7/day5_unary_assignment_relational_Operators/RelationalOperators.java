package lessons_EU7.day5_unary_assignment_relational_Operators;

public class RelationalOperators {

	public static void main(String[] args) {
			
		byte b1= 1;
		byte b2= 2;
		double d1=3.5;
		int i1= 17;
		float f1= (float)67.0;
		
		boolean test1= b1<b2;
		System.out.println(test1);
		
		boolean test2= b1>b2;
		System.out.println(test2);
		
		boolean test3= (d1!=b1); // good looking by ()
		System.out.println(test3);
		boolean test31= (d1==b1);
		System.out.println(test31);
		
		boolean test4 = (i1*d1)>=(f1-42);
		System.out.println(test4);
		
		System.out.println((6*4)<=(8*3));
		System.out.println('a'>'b'); // in unicode a is.., b is ... Every character have a value in the unicode.
		// != not equel   == equel
		
		

	}

}
