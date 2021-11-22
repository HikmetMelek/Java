package lessons_EU7.day32_arrayList_Part2;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(30);list1.add(12);list1.add(22);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(30);list2.add(345);list2.add(1);list2.add(12);list2.add(22);list2.add(12);

		System.out.println(list1);
		System.out.println(list2);
		
		// removes all matching values from list1
		list2.removeAll(list1);
		System.out.println(list2);
		
		
		
	}

}
