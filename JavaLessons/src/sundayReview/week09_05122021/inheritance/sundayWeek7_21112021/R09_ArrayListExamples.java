package sundayReview.week09_05122021.inheritance.sundayWeek7_21112021;

import java.util.ArrayList;
import java.util.Arrays;

public class R09_ArrayListExamples {

	public static void main(String[] args) {
		
		String[] arr= {"Java","C#","C++","Python"};
		ArrayList<String> list= new ArrayList<>();
	// Arrays utility class Arrays.asList
		
		list.addAll(Arrays.asList(arr));
		System.out.println(list);

		ArrayList<String> list2= new ArrayList<>(Arrays.asList(arr));
		System.out.println(list2);
		
		ArrayList<String> list3= new ArrayList<>(Arrays.asList("C#","C++"));
		System.out.println(list3);
		
		list.addAll(list2);
		list.addAll(list3);
		System.out.println(list);
		
		list.removeAll(list3); 
		System.out.println(list);
		
		
		
	}

}
