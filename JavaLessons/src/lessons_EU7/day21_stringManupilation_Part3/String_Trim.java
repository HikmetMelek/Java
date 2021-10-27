package lessons_EU7.day21_stringManupilation_Part3;

public class String_Trim {

	public static void main(String[] args) {
	
		String sentence = "   Java St  ring Mani  pulation is fun!  ";// only trim leading and trailing(ending) spaces.
		sentence= sentence.trim();
		System.out.println(sentence);
		
		
		String str= " 342 "; // |342|
		System.out.println("|" + str.trim() + "|");
		
	//	System.out.println(str.replace(" ",	"|"));
		
		
		
	}

}
