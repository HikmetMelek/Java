package lessons_EU7.sundayReview.sundayWeek7_21112021;

import java.util.Arrays;

public class R03_IsAnagram {

	public static void main(String[] args) {
		
		// I want to review Arrays utility class
		
		System.out.println(isAnagram("listen", "silent"));
		
	}


	public static boolean isAnagram(String wordOne, String wordTwo) {
		
		
		boolean flag = false;  // only it will turn true if the condition happens
		
		if(wordOne.length()!=wordTwo.length()) {
			return flag;
		}
		
		wordOne = wordOne.toLowerCase().replaceAll(" ", "");
		wordTwo = wordTwo.toLowerCase().replaceAll(" ", "");
		
		char [] charArr1 = wordOne.toCharArray();
		char [] charArr2 = wordTwo.toCharArray();
		
		// like sort method
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
//		System.out.println(Arrays.toString(charArr1));
//		System.out.println(Arrays.toString(charArr2));
		
		if(Arrays.equals(charArr1, charArr2)) {  
			flag=true;
		}
		
		return flag;
	}

	

}
