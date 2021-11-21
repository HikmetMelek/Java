package lessons_EU7.sundayReview.sundayWeek7_21112021;

import java.util.*;

public class R10_ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> codes = new ArrayList<>(Arrays.asList("OK","Created","Forbidden","OK","Unauthorized","Created"));	
		System.out.println(removeDublicate(codes));
		
	}
	
	public static ArrayList<String> removeDublicate(ArrayList<String> list){
		
		ArrayList<String> nonDuplicate= new ArrayList<>(); // null;
		
		for(String each: list){
			if(!nonDuplicate.contains(each)) {
				nonDuplicate.add(each);
			}
			
		}
		return nonDuplicate;
	}
	
}
