package sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A07_SentenceSplit {

	public static void main(String[] args) {
		
		String amazonResult="1-16 of over 7,000 results for java";
		
		String[] array= amazonResult.split(" ");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		System.out.println("how many results are there in my search: "+ array[3]);
		System.out.println("first element: "+ array[0]);
		System.out.println("second element: "+ array[1]);

		String amazonResult2="1-16xofxoverx7000xresultsxforxjava";
		String[] array2= amazonResult2.split("x");
		System.out.println(Arrays.toString(array2));
		System.out.println("Number of 'x' in my statement: "+ (array2.length-1)); // space: length-1
		String[] array3= amazonResult2.split("x",2); // after first x , split string. array length:2
		System.out.println(Arrays.toString(array3));
	}

}
