package sundayReview.sundayWeek8_28112021;

import java.util.*;

public class R02_CollectionsUtility {

	public static void main(String[] args) {
		// Collections
		
		ArrayList<Character> list = new ArrayList<>();
		
		list.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
		
		System.out.println(list.size());

		System.out.println(list);
		
		// reverse arraylist
		Collections.reverse(list);
		System.out.println("reversed list: "+list);
		
		// frequency method that helps to look for an element
		int freOfChar= Collections.frequency(list, 'a');
		System.out.println(freOfChar); // list have 2 'a'
		
		ArrayList<Integer> nums= new ArrayList<>();
		nums.addAll(Arrays.asList(10,35,100,-23,1000,564));
		System.out.println("max num: "+ Collections.max(nums));
		System.out.println("min num: "+ Collections.min(nums));
		
		//max and min for characters // looking ASCII code
		System.out.println("max char: "+ Collections.max(list));
		System.out.println("min char: "+ Collections.min(list));
		
		
	}
}
