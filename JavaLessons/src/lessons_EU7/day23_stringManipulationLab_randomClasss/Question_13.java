package lessons_EU7.day23_stringManipulationLab_randomClasss;

public class Question_13 {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
		System.out.println(doubleChar("public"));

	}

	public static String doubleChar(String str) {
		
		String str2="";
		
		for (int i=0; i<str.length(); i++) {
			
			str2+= str.substring(i, i+1).concat(str.substring(i, i+1)); 
		}
		
		return str2;
		
		
	}
}
