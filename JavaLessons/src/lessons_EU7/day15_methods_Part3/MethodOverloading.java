package lessons_EU7.day15_methods_Part3;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println(sum(3, 4));
		
		System.out.println(sum(7, 3, 1));
		
		int x= sum(4, 5, 6, 5);
		System.out.println(x);
		System.out.println(sum("hello"));
		
	}

	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a,int b, int c) {
		return a+b+c;
	}
	
	public static int sum(int a,int b, int c, int d) {
		return a+b+c+d;
	}
	
	public static String sum(String str) {
		return "str";
	}
}
