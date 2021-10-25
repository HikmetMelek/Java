package lessons_EU7.day19_stringManipulation_Part1;

public class String_Concat {

	public static void main(String[] args) {
	
		String str= "Java";
		System.out.println(str.concat("+selenium"));
		System.out.println(str.concat(" in eclipse"));
		
		System.out.println(str);
		
		System.out.println("-------------");
		str=str.concat("+Eclipse");
		System.out.println(str);
		
		System.out.println("-------------");
		str=str.concat(" Automation");
		System.out.println(str);
		
		System.out.println("-------------");
		// str= str.concat(123)  // this will not work
		str= str+ 123; // string+ int= string
		System.out.println(str);
		
		str= str+ true;
		System.out.println(str);
		System.out.println("-------------");
		String word= "Hi";
		word= word.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word);
		
		
		
		
	}

}
