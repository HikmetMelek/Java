package lessons_EU7.day27_arrays_Part4_Lab4;

public class Lab4_question3 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {7,3};
		
		System.out.println(findFirstEnd(a, b));
		
	}
	public static String findFirstEnd(int[] x, int[] y) {
		
		if(!(x.length>1)) return "x is not a valid array";
		if(!(y.length>1)) return "y is not a valid array";
		
		if (x[0]==y[0] || x[x.length-1]==y[y.length-1]) return "true";
		else return "false";
		
	}
}
