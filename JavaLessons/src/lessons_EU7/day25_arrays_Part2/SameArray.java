package lessons_EU7.day25_arrays_Part2;

public class SameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array1= {2,4,6,8};
		int [] array2= array1;
		
		array1[0]=200;
		array2[2]=1000;
		System.out.println("the contencts of array1: ");
		for (int list : array1) {
			System.out.println(list);
		}
		System.out.println("-----------------------------------------");
		
		for (int list: array2) {
			System.out.println(list);
		}
		
	}

}
