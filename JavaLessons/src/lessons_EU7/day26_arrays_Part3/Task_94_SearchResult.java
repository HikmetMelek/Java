package lessons_EU7.day26_arrays_Part3;

import java.util.Arrays;

public class Task_94_SearchResult {

	public static void main(String[] args) {
		//output: CD132G00ABC!
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		String[] arr1= info1.split("password : ");
		String[] arr2= info2.split("password : ");
		
		//System.out.println(Arrays.toString(arr1));
		String pass1= arr1[1].split(". Please")[0];  // String[] names={"ali","mehmet"}-->  String name= names[0]--> ali
		String pass2= arr2[1].split(". Please")[0];
		//System.out.println(Arrays.toString(arr1[1].split(". Please")));
		pass1= pass1.substring(3, 9);
		pass2= pass2.substring(3, 9);
		System.out.println(pass1.trim()+pass2.trim());
		
		
		
		
	}

}
