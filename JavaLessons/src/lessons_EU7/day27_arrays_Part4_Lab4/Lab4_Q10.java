package lessons_EU7.day27_arrays_Part4_Lab4;

public class Lab4_Q10 {

	public static void main(String[] args) {
		
		int[] x = {2,2};
		int[] y = {3,3};
		int[] a = {2,3};
		int[] b = {12,20,42};
		int[] c = {2,2,2};
		System.out.println(twice(x));
		System.out.println(twice(y));
		System.out.println(twice(a));
		System.out.println(twice(b));
		System.out.println(twice(c));
		
	}

	public static boolean twice(int[] numbers) {
		int counter1=0;
		int counter2=0;
		
		for(int each: numbers) {
			if(each==2)
				counter1++;
		}
		
		for(int each: numbers) {
			if(each==3)
				counter2++;
		}
		
		if (counter1==2 || counter2==2) return true;
		else return false;
		
	}
	/*
		for(int each: numbers) {
			if(each==2)  counter1++;
			else if (each==3) counter2++;
		}
		if (counter1==2 || counter2==2) return true;
		else return false;
		
		*/
	
	
	
	
	
	
}
