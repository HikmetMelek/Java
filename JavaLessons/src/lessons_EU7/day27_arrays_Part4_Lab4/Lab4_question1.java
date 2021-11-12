package lessons_EU7.day27_arrays_Part4_Lab4;

public class Lab4_question1 {

	public static void main(String[] args) {	
		
	int[] array= {2,5,6};
	int[] array1= {1,2,3,4,7,8};
	int[] y = {6,1,2,3};
	int[] z = {13,6,1,2,3};
	int[] k = {1};
	System.out.println(firstLast6(array));
	System.out.println(firstLast6(array1));
	System.out.println(firstLast6(y));
	System.out.println(firstLast6(z));
	System.out.println(firstLast6(k));
	
	}
	
	public static boolean firstLast6(int [] numbers) {
		if (numbers.length>1) {
			if(numbers[0]==6 || numbers[numbers.length-1]==6)
					return true;	
		}
		
		return false;
	}
	// OZZY's result:
//	public static boolean firstLast6(int[] arr) {
//		
//		if(arr.length<1) {
//			return false;
//		}
//		
//		if(arr[0]==6 || arr[arr.length-1]==6) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	
	

}
