package lessons_EU7.day5_unary_assignment_relational_Operators;

public class task20_IncrementDecrement {

	public static void main(String[] args) {
		
		int a=1;
		int result= -a-- + a++ / -a-- * --a;
		
		// 'a' in memory : 1 > 0> 1>0>1
		// result:  -1 + 0 / -1 * -1 = -1 + 0 * -1 = -1 + 0 = -1
		
		System.out.println("a= "+a);
		System.out.println("result= "+result);

	}

}
