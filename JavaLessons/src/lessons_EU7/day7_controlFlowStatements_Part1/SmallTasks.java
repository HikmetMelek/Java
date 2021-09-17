package lessons_EU7.day7_controlFlowStatements_Part1;

public class SmallTasks {

	public static void main(String[] args) {
		//1
		int x,y;
		x=10;
		y=20;
			
			if(y==20) {
			x=5;
			}
			System.out.println("x = "+x+"     y = "+y);
		
		System.out.println("*********************");
		//2
		int hours=41;
		double payRate=100;
			
			if (hours>40) {
			payRate=payRate*1.5;
			
			}
		System.out.println("PayRate is "+payRate);
		
		System.out.println("*********************");
		//3
		boolean max= false;
		int fee=20;
			
			if (max==true) { //   if(max) ==> give you same output..
			fee=50;
			
			}
		System.out.println("Fee is "+ fee);
		//4
		System.out.println("*********************");
		
		int b = 6;
		int c= 99;
		int a=22;
			
			if (b==5 && c>= 100) a=20;
		
			System.out.println("a= "+a);

		System.out.println("*********************");
		//5
		int temp= 75 ;
		
			if (temp>=70 & temp<=80) {
			System.out.println("Ideal Temp");	
			}
		
			System.out.println("Not Ideal Temp");
			
	}

}
