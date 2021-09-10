package lessons_EU7.day4_arithmetic_operators;

public class casting_implicit_esplicit {

	// Casting: Implicit,Explicit.
	
	public static void main(String[] args) {
		
			int pies=10;
			int people=4;
			double piesPerson;
			piesPerson=pies/people;  // because result is int : 2.0
				System.out.println(piesPerson);
				
		System.out.println("==============================");
		
			piesPerson=(double)pies/people;
				System.out.println(piesPerson);
		
		System.out.println("==============================");
		
			piesPerson=pies/(double)people; // int/double: double , cause double is bigger.
				System.out.println(piesPerson);
		
		System.out.println("==============================");
		
			piesPerson=(double)(pies/people); // (double)(int/int): (double)int : (double)2.0 ; cause result is: 2.0 (int/int) ...casting 
				System.out.println(piesPerson);
		
				// int/int: 2.0  // double/double or double/int  or int/double : 2.5
		

	}

}
