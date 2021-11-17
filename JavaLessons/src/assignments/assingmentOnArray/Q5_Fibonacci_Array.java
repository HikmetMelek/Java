package assignments.assingmentOnArray;

public class Q5_Fibonacci_Array {

	public static void main(String[] args) {
		// fibonacci series till 'n';
		int n=15;
	
		fibonacci(n);

	}
	public static int[] fibonacci(int n) {
		
		int[] arr= new int[n];

		int number=0;
		int secondNumber=1;
		arr[0]=0;
		arr[1]=1;
		
		System.out.print(number +", "+ secondNumber);
		
		for (int i=1; i<n-1; i++) {
			
			arr[i+1]= number + secondNumber;
			System.out.print(", "+ arr[i+1]);
			
			number= secondNumber;
			secondNumber= arr[i+1];
				
		}
		return arr;
	}
}
