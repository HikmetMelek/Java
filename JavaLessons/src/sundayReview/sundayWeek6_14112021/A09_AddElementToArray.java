package sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A09_AddElementToArray {

	public static void main(String[] args) {
		
		String[] students= {"erdem", "yasin", "recep", "hande", "selena"};
		System.out.println(Arrays.toString(addElement(students, "melek")));
	}

	public static String[] addElement(String[] arr, String element) {
		
		String[] newArray= new String[arr.length+1];
		
		int i=0;
		for(String each: arr) {
			newArray[i++]= each; // newArray[i]= each ;
								 // i++;
		}
		newArray[i]= element;
		
		return newArray;
		
	}
}
