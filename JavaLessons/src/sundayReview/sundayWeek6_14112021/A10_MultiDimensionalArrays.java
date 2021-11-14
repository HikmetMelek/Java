package lessons_EU7.sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A10_MultiDimensionalArrays {

	public static void main(String[] args) {
		
// single dimensional arrays: means that contain single elements.
// 2D arrays: means that contains arrays object
// 3D arrays: means, it holds multiple 2D arrays ........

		int [][] array2D= { {1,2,3}, {4,5,6}, {7,8,9} };  // 2D array: [index of array][index of element]
		
		System.out.println(array2D.length); //3   // how many arrays inside array2D  // every row is a array
		System.out.println(Arrays.toString(array2D[1]));
		System.out.println(array2D[1][2]); //6
		
		
		
		
		
	}

}
