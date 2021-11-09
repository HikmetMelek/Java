package lessons_EU7.day25_arrays_Part2;

public class PassElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {5,10,15,20,50,30};
		
		for(int value : numbers) {
			
			showValue(value);
			
		}

	}
	
	public static void showValue(int n) {
		
		System.out.print(n + " ");
		
	}
		


}
