package lessons_EU7.sundayReview.sundayWeek7_21112021;

import java.util.Arrays;

public class R02_CharArray2 {

	public static void main(String[] args) {
		
		int [] alphabet = new int[26];
		// 97 is the value of 'a' in ASCII Table
		
//		alphabet['l'-97] = alphabet['l'-97]+1;
	//	
//		alphabet['i'-97] = alphabet['i'-97]+1;
	//	
//		alphabet['s'-97] = alphabet['s'-97]+1;
		
		String word = "listen";
		for(char each: word.toCharArray()) {
			alphabet[each-97]=alphabet[each-97]+1;
		}
		System.out.println(Arrays.toString(alphabet));
		
		String word2 = "filent"; // try with silent
		for(char each: word2.toCharArray()) {
			alphabet[each-97]=alphabet[each-97]-1;
		}
		System.out.println(Arrays.toString(alphabet));
		
		
		
		
		
		
		

	}

}
