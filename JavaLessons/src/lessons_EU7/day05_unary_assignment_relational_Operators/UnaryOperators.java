package lessons_EU7.day05_unary_assignment_relational_Operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int i1=+10;
		int i2=-100;
		int i3= -(i1+i2);
		System.out.println("i1= "+i1);
		System.out.println("i2= "+i2);
		System.out.println("i3= "+i3);
			
		boolean flag= true;
		System.out.println(!flag);
		System.out.println(!!flag);
		System.out.println("------------------------");
		
		int i=10, j=5;
		//i++; // same as i= i+1 } will change different line= post
		//--j; //same as j= j-1  } active on the same line=cause  pre
		System.out.println(i++);
		System.out.println(i++);
		System.out.println("i= "+i);
		System.out.println("----------------------");
		System.out.println(--j);
		System.out.println("j= "+j);
		System.out.println(j);
		System.out.println(j);
		--j;
		System.out.println(j);
		
		// i=12, j=3
		int res= i++ + --j; // different line + same line
		System.out.println("res= " + res); //res=12+2:14
		int res1= i++ + --j;
		System.out.println("res1= " + res1); //res1=13+1:14
		
		
		
		
			
			
			
	}

}
