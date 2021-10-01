package lessons_EU7.day14_methods_Part2;

public class ValueReturn {

	public static void main(String[] args) { 
		
		System.out.println(sum(2,3)); // if method become return (other than "void" --> int, double, String etc.),
										// we use "sum method" with like this:1_ " System.out.println(sum(2,3))" OR
		int v1= sum(2, 3);				// we assign another data type, like this:2_ " int v1= sum(2, 3)"
		
		System.out.println(v1*5);
		
		System.out.println(v1);

	}
	
	public static int sum (int num1, int num2) { // if you use "void" "result" is local value. and we can not use 
										// out of "sum method". but you use result's data type in method (int)
										// and  keyword--> return, you can use it out of method ( in the main method 
										// or another methods)..
		int result;    // if method with void , "result" will be local variable. "result" only can be used  
					  // in the "sum method";  void: do not return.
		result= num1+num2;
		
		return result;
		
	}
	

}
