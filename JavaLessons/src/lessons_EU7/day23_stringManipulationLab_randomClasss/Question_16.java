package lessons_EU7.day23_stringManipulationLab_randomClasss;

public class Question_16 {

	public static void main(String[] args) {
		
		System.out.println(atFirst("hello"));
		System.out.println(atFirst("hi"));
		System.out.println(atFirst("h"));

	}

	public static String atFirst(String str) {
		
		if (str.length()<2) 
			return str.substring(0).concat("@");
		
		else return str.substring(0, 2);
		
		
		
		
		
	}
}
