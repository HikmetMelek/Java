package lessons_EU7.day30_wrapperClass;

import java.util.Arrays;

public class Task_96_ConvertingTemp {

	public static void main(String[] args) {
		// output --> 89 degree is equal to 32 celcius.
		String str1 = "Today weather is sunny and 89 degree. It is a perfect day to practice java.";
		
		String [] arr= str1.split("sunny and ");
		//System.out.println(Arrays.toString(arr));
		arr = arr[1].split(" degree");
		
		String degree = arr[0].trim(); // "89" --> string
		//System.out.println(degree);
		
		double degreeF = Double.parseDouble(degree); // "degree" was a string. it return a double with parsing.
		//System.out.println(degreeF);
		
		double degreeC = (degreeF - 32) * 5/9;
		
		System.out.println(degreeF + " degree is equal to " + degreeC + " celcius.");
		System.out.println(Math.round(degreeF) + " degree is equal to " + Math.round(degreeC) + " celcius.");

	}

}
