package lessons_EU7.day19_stringManipulation_Part1;

public class String_CharAt {

	public static void main(String[] args) {
	
		String word= "Computer";
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));// Exception in thread "main" java.lang.StringIndexOutOfBoundsException:
											// String index out of range: 8
		System.out.println("------------------------");
		
		String word2="Apple";
		
		if (word2.charAt(0)=='A') System.out.println("A is the first character");
		else System.out.println("A is not the first character");
		
		System.out.println("------------------------");
		
		String word3="civic";
		
		if (word3.charAt(0)==word3.charAt(4)) System.out.println("first and last characters are same");
		else System.out.println("first and last characters are not same");
		
		System.out.println("------------------------");
		
		String word4="Java";
		
		int x= word4.length();
		int y= x-1;
		System.out.println("last character of "+word4+" is "+ word4.charAt(y));
		
		String word5 = "Java Script";
		char lastChar = word5.charAt(word5.length()-1);
		System.out.println("Last char of " + word5 + " is " + lastChar);
		
		
	}

}
