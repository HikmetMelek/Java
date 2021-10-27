package lessons_EU7.day21_stringManupilation_Part3;

public class String_SubString {

	public static void main(String[] args) {
		
		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		System.out.println("****************************************");
		
		String chars="{{}}";
		String word="AUTOMATION";
		System.out.println(chars.substring(0, 2) + word + chars.substring(2));
		
		System.out.println("****************************************");
		
		System.out.println(word.toLowerCase());
		System.out.println(sentence.toUpperCase());
	
		
	}

}
