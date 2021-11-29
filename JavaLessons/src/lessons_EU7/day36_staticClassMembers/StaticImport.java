package lessons_EU7.day36_staticClassMembers;

import static java.lang.Math.*; // import all static properties belongs to Math Class

public class StaticImport {
	
	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		System.out.println(sqrt(25)); // when u write "import static java.lang.Math.*; " u do not have to use class name(Math)
		
		System.out.println(PI);
		 
		
		
	}

}
