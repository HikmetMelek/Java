package lessons_EU7.sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A11_BiggestIn2DArray {

	public static void main(String[] args) {
		
		int[][] arr= {{3,12,3,34,12}, {13,7,456,34,3} ,{-5,-24,-2,-10,-4}};
		System.out.println(Arrays.toString(biggestValues(arr)));
		System.out.println(Arrays.deepToString(arr)); // this one we can use for printing 2D arrays.

	}

	public static int[] biggestValues(int [][] arr) {
		
		int[] biggestArr= new int[arr.length];  
		
		for (int i=0; i< arr.length; i++) {
			int max=arr[i][0];
			for (int j=0; j< arr[i].length; j++) {
				if(max< arr[i][j])
					max= arr[i][j];
			}
			biggestArr[i]= max;
		}
		return biggestArr;
			
	}
	
	// implement same task with Arrays.  with 'sort()'
}
