package lessons_EU7.day13_methods_Part1;

public class Tas_62 {

	public static void main(String[] args) {
		
		greatestNumber(5, 2, 3);
		
	}

	public static void greatestNumber(int n1, int n2, int n3) {
		
		if (n1>n2 && n1>n3)        System.out.println(n1+" is bigger");
	    else if (n2>n1 && n2>n3)   System.out.println(n2+" is bigger");
	    else if (n3>n1 && n3>n2)   System.out.println(n3+" is bigger");
		
	}
	
}
