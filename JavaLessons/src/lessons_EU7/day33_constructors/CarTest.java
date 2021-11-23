package lessons_EU7.day33_constructors;

public class CarTest {

	public static void main(String[] args) {
		
		CarClass_withSuperMethod c1= new CarClass_withSuperMethod();
		CarClass_withSuperMethod c2= new CarClass_withSuperMethod("Honda", "Civic", 2020, 5000, "white");
		//1_ new--> call constructor
		//2_ which constructor?
		//i want to you execute, constructor which does not have any arguments
		
		System.out.println(c1.make);
		System.out.println(c2.color);
		
		CarClass_withSuperMethod c3 = new CarClass_withSuperMethod("Corolla", "Toyota", 2015, 32000, "Yellow");
		CarClass_withSuperMethod c4 = new CarClass_withSuperMethod("Altima", "Nissan", 2014, 41000, "Black");
		
		System.out.println(c4.mile);
		
	}

}
