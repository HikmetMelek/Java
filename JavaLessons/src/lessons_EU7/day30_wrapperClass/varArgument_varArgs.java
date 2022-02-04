package lessons_EU7.day30_wrapperClass;

public class varArgument_varArgs {

	public static void main(String[] args) {
		
		sum(2,4);
		sum2(2,3,5,6,7,8);
		concat("apple", "orange", "123");
		
		
	}
	
	public static void sum(int n1, int n2) {
		
		System.out.println(n1+n2);
	}
	
	public static void sum2(int... numbers) { // A varArg(variable arguments) parameter can take a variable number of arguments 
											// take 'numbers' like a array.
		int sum=0;
		for(int i: numbers) {
			sum+= i;
		}
		
		System.out.println(sum);
	}
	
	public static void concat(String... strs) {
		
		String newStr="";
		for(String i: strs) {
			newStr+= i.charAt(2);
		}
		System.out.println(newStr);
		
	}
	
}
