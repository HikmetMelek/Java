package lessons_EU7.day20_stringManipulation_Part2;

public class String_Equals {

	public static void main(String[] args) {
		// same value has to be..
		// if you want to use with different objects, you have to use ".equals method"..
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		String s5 = "welcome to java";
		
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equals(s3);
		
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1==s2;
		boolean b4 = s1==s3;
		
		System.out.println(b3 + "|" + b4);
		
		String s4 = new String("Welcome to Java");
		System.out.println(s1==s4); //  while "==" --> false: because different objects..
		System.out.println(s1.equals(s4)); // true: different objects  BUT same value..
		
		System.out.println("---------------------------------------------------");
		// .equalsIgnoreCase(); do not care about case(small or big)..
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.equals(s5));
		

	}

}
