package lessons_EU7.day25_arrays_Part2;

import java.util.Arrays;

public class Task_92_TableArray {

	public static void main(String[] args) {
		// num 1-10;
		int[] num= new int[10];
		
		for (int i=0; i< num.length; i++) {
			num[i]=i+1;
		}
		
		for (int i=0; i< num.length; i++) {
			System.out.println(num[i]*19);
		}
		System.out.println(Arrays.toString(num));
		
	}

}
