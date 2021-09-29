package lessons_EU7.day11_controlFlowStatements_Part5;

public class ForLoopRules {

	public static void main(String[] args) {
		
		//  1- creating loop
		
//		for( ; ; ){
			System.out.println("hello");
//		}
		
		int i=1;
		for ( ; i<=10; i++){
			System.out.println("hello");
		}
			
			
		//for (int i=1; i<=10; i++) {
		//	System.out.println(i);
		//}

		//for(int num=20; num>=10; num--) {
		//	System.out.println("num :"+num);
		//}
		
		//for(int num=0; num<100; num+=10) {
			//System.out.println("num :"+num);	
		//}
		
		//for (int i=55; i<=100; i+=5){
		//	System.out.println("num: "+i);
		//}
		
		// 2- Adding multiple Terms to the for Statement.
		
//		int x=0;
//		for (long y=0, z=4; x<5 && y<10; x++, y++) {  // answer: 0 1 2 3 4 coming from y; 5 is coming from x 
//			System.out.print(y+" ");
//		}
//		
//		 // you can not use y,z ; out of the for loop. y, z are declared that can only use in for loop.
								// so we can use same variables names in the different loops.
		
							  // x is declared as int "out of for loop" but at the same time you can use x in the loop.
								// because x is global (out of loop) ...
		
		// 3- Redeclaring a variable in the init block.
		
//		int x=0;
//		for (long y=0,x=4; x<5 && y<10; x++,y++) {// does not compile. you can not "redeclare" for x./ x is int. but 
//			System.out.println("Hello");			// in the for loop x is long. 
//		}
		
//		int x=0;
//		long y=0;
//		for (y=1,x=4; x<5 && y<10; x++,y++) { // you can reassign. but you cannot redeclare..
//			System.out.println("Hello");
//		}
		
		// 4- using incompatible data type in the init block
		// variables in the init block must all be the same data type
		
//		for (long y=1,int x=4; x<5 && y<10; x++,y++) { // you cannot use different data type // you cannot use it.
//			System.out.println("Hello");
//		}
		
		//5- Using loop variables outside the loop
		
//		for (long y=0, x=4; x<5 && y<10; x++, y++) {  
//		   System.out.print(y+" ");
//		}
//		System.out.println(x); // does not compile (x was declared in the loop)
		
		
		
		
	}

}
