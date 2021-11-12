package lessons_EU7.day27_arrays_Part4_Lab4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		// toString()
		int[] nums= {43,12,4,1,3,5};
		System.out.println(Arrays.toString(nums));
		
		
		//equals()
		int[] nums1= {1,2,3};
		int[] nums2= {1,2,3};
		System.out.println(Arrays.equals(nums1, nums2));
		
		
		//sort() : sorts array in ascending order(artan düzen)
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages= {"Zulu","Spanish","Italian","English","Polish","Arabic"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		String[] languages1= {"Zulu","Spanish","Italian","english","Polish","arabic"};
		Arrays.sort(languages1);
		System.out.println(Arrays.toString(languages1)); //first write capital letter, then write small letter.(look at output)
		
		String[] languages2= {"Zulu","Spanish","Italian","English","1Polish","arabic"};
		Arrays.sort(languages2);
		System.out.println(Arrays.toString(languages2)); // first took number, then capital letter
		
		String[] languages3= {"Zulu","Spanish","Italian","english","1Polish","arabic","@abc"};
		Arrays.sort(languages3);
		System.out.println(Arrays.toString(languages3));
		
		
		//binarySearch()
		int[] numX= {4,6,7,10,55}; 
		System.out.println(Arrays.binarySearch(numX, 7)); //2=  gives me index number of "7"
		System.out.println(Arrays.binarySearch(numX, 55));//4
		System.out.println(Arrays.binarySearch(numX, 5)); //-2 //(-(insertionPoint)-1) //5: after 4, before 6 --> 
										     // so 5: 1.char --> (-(1)-1)= -2
		System.out.println(Arrays.binarySearch(numX, 15));//-5
		
		
		//copyOf()
		double[] d1 = {2.3 ,4.5 ,12.4};
		double[] d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0]=100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		d2[1]=400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		//double[] d3= Arrays.copyOf(d2, d2.length);
		double[] d3= Arrays.copyOf(d2, 5);
		System.out.println(Arrays.toString(d3));
		
		System.out.println("***");
		
		d2[0]=5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		//String :  '=='  and '.equals'
		//Array :  'reference equality' and 'copyOf()'
		
	}

}
