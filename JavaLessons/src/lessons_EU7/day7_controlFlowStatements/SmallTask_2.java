package lessons_EU7.day7_controlFlowStatements;

public class SmallTask_2 {

	public static void main(String[] args) {
		// task1
		
		int y;
		int x=120;
		
		y= (x>100) ? 20 : 0;// y= (statement) ?==>ise  --> output      : ===> else
		
		
		System.out.println("y= "+y);
		System.out.println("****************");
		//task2
		
		int y1=99;
		int x1;
		
		if (y1==100) x1=1; else x1=0;
			System.out.println("x1= "+x1);
		System.out.println("****************");
		//task2
		
		int a,b,c;
		a=12;
		if(a<10) {
			b=0;
			c=1;
			System.out.println("b= "+b+"\tc= "+c);
		} else { 
			b=-99;
			c=0;
			System.out.println("b="+b+"\nc="+c);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
