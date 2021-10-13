package lessons_EU7.day16_classObjects_Part1;

public class CarObjecs {

	public static void main(String[] args) {
		
		Car car1= new Car();
		
		car1.printCarInfo();
		
		car1.make="Ford";
		car1.model= "Fiesta";
		car1.color="red";
		car1.currentSpeed=55;
		
		car1.printCarInfo();
		System.out.println("-----------------------------");
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		System.out.println("-----------------------------");
		car1.drive();
		System.out.println("-----------------------------");
		System.out.println("Before: "+ car1.currentSpeed);
		car1.accelerate(20);
		System.out.println("After: "+ car1.currentSpeed);

	}

}
