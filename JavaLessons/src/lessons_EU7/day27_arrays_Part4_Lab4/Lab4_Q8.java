package lessons_EU7.day27_arrays_Part4_Lab4;

public class Lab4_Q8 {

	public static void main(String[] args) {
		
		int[] x = {2,5};
		int[] y = {4,3,7};
		int[] z = {4,5};
		System.out.println(contains2or3(x));
		System.out.println(contains2or3(y));
		System.out.println(contains2or3(z));
		
	}
	public static boolean contains2or3(int[] arr) {
		 
		for(int each: arr) {
			if(each==2 || each==3)
				return true;	
		}
		
		return false;
	}
	
	
	
}
