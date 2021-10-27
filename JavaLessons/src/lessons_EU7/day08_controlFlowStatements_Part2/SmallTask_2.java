package lessons_EU7.day08_controlFlowStatements_Part2;

public class SmallTask_2 {

	public static void main(String[] args) {
		
		//task1-Write an if-else statement that assigns 20 to variable y 
		//if the variable x is greater than 100. Otherwise, 
		//it should assign 0 to the variable y
		
		int y=10;
		int x=120;
		
		y= (x>100) ? 20 : 0;// y= (statement) ?==>ise  --> output      : ===> else
		
		
		System.out.println("y= "+y);
		
		System.out.println("****************");
		
		//task2-Write an if-else statement that assigns 1 to x when y is equal to 100. 
		//Otherwise, it should assign 0 to x.
		
		
		if (y==100) x=1; else x=0;
			System.out.println("x= "+x);
		
			System.out.println("****************");
		
		//task3-Write an if-else statement that assigns 0 to the variable b and 
		//assigns 1 to the variable c if the variable a is less than 10.
		//Otherwise, it should assign –99 to the variable b and assign 0 to the variable c2
		
		int a,b,c;
		a=8;
		if(a<10) {
			b=0;
			c=1;
			
		} else { 
			b=-99;
			c=0;
			
		}
		System.out.println("b="+b+"\nc="+c);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
