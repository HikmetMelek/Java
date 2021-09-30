package lessons_EU7.day13_methods_Part1;

public class Task_63 {

	public static void main(String[] args) {
		
		calculateCelcius(32);
		calculateCelcius(50);
		
	}

	
	public static void calculateCelcius(double fahrenheit) {
		
		double celcius= (fahrenheit-32)*5/9;
		  
		System.out.println(fahrenheit+ " fahrenheit is equal to "+ celcius+" celcius");
		
		
	}
}
