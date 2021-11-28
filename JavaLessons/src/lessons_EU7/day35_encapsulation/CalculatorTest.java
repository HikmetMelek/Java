package lessons_EU7.day35_encapsulation;

public class CalculatorTest {

	public static void main(String[] args) {
		/*
		Floor f = new Floor(10,20);
		Carpet c = new Carpet(5.2);
		
		Calculator cal = new Calculator(f,c); 
		
		System.out.println(cal.getTotalCost());
		*/
		
		Calculator cal= new Calculator(new Floor(2.5,3.0), new Carpet(15.0));
		
		System.out.println(cal.getTotalCost());
	

	}

}
