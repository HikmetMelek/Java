package lessons_EU7.sundayReview.sundayWeek5_31102021;

public class S08_Taskes {

	public static void main(String[] args) {
		
		System.out.println("Frequency of character is: "+ frequency("aabcccd",'c'));
		System.out.println("Unique characters are: "+ uniqueCharacter("aabcccd"));
		System.out.println(removeDuplicate("aabcccd"));
		System.out.println(frequencyOfChars("aabcccd"));


	}

	public static int frequency(String str, char c) {
		
		int counter=0;
		
		for (int i=0; i<str.length();i++) {
			if (c==str.charAt(i)){
			counter++;
			
			}
			
		} 
		return counter;
		
	}
	
	public static String uniqueCharacter(String str){
		
		String result="";
		
		for (int i=0; i<str.length(); i++) {
			
			char c= str.charAt(i);
			if(frequency(str, c)==1) 
				result+=c;
				
		}
			
		return result; 
	}
		
	public static String removeDuplicate(String str) {
		String result = ""; // creating a dummy result value to hold my result object
		
		for (int i = 0; i< str.length(); i++) {
			
			String each = ""+ str.charAt(i);

	//			if (result.contains(each)) {
	//				continue;
	//			}
			
			if(!result.contains(each)) {
			result += each;
			}
		}
		
		return result;
		
	}
	public static String frequencyOfChars(String str) {
		// Task 4: FrequencyOfChar()  str = "aabcccd"; --- > a:2 | b:1 | c:3 | d:1
		
		// char 'a' ---65    b:66 
		
		// result += ch + " : "+ frequency();
		String result = "";
		for (int i = 0; i < str.length();i++ ) {
			
			char each = str.charAt(i); // you can write as: String each= "" + str.charAt(i);
		
			if (!result.contains(""+each)) {
				result+=each+" : "+ frequency(str,each)+" | ";
			}
		}
		return result.substring(0,result.length()-3); // length-3: not to put " | " mark at the end
	}
	
	
	
}
