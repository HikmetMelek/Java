package lessons_EU7.day38_inheritance_Part2;

public class FullTimeEmployee extends Employee{
	
	@Override
	public void calculatePay(int hours, double rate) {
		double total= (hours*rate)*1.05;
		System.out.println("FullTime Employee total pay: "+ total);
	}
	
	
	
	
	

}
